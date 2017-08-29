package solution.chapter1_twoSum;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author:  yangpeng
 * @Date:2017年8月28日下午3:15:58
 */
//Given an array of integers, return indices of the two numbers 
//such that they add up to a specific target.

//You may assume that each input would have exactly one solution, 
//and you may not use the same element twice.
//每次输入只会有一个正确结果，同一个数不会用到两次
/*
 * Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 */
public class Solution {
	/*
	 * 暴力法
	 */
	public int[] twoSum1(int[] nums,int target) {
		int[] index=new int[]{0,1};  
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				 if(nums[i]+nums[j]==target){
					 index[0]=i;
				 	 index[1]=j;
				 	 return index;
				 } 
			}
		}
		return  index;
	}
	/*
	 * HashSet
	 * 利用HashSet元素不能重复的原理，新建一个HashSet，然后可先检查target-nums[i]能否加入该HashSet，
	 * 若能，则说明前面的数据没有与第i个符合的组合。在把该target-nums[i]删除，重新添加nums[i]
	 * （避免有两个元素相等返回错误判断）。当添加不成功，则说明存在符合的组合，
	 * 记录此时的i，并从i以前的数组寻找他的另一半。有点繁琐，但时间复杂度为O(n)，空间复杂度为O(n)
	 */
	public int[] twoSum2(int[] nums,int target){
		HashSet<Integer>set= new HashSet<Integer>();
		int[] index=new int[]{0,1};
		for(int i=0;i<nums.length;i++){
			if(set.add(target-nums[i])){////检查是否有nums[i]配对的元素存在，无则添加成功
				set.remove(target-nums[i]);//添加元素只是为了判断是否存在，本来不应该添加的这里右删掉
				set.add(nums[i]);
			}else{
				index[1]=i;
				for(int j=0;j<i;j++){
					if(target==(nums[i]+nums[j])){
						index[0]=j;
						return index;
					}
				}
				return index;
			}
		}
		return index;
	}
	/*
	 * HashMap
	 * 用HashMap来做，道理相同，不过跟二还是有点区别。
	 * 1、HashMap要需要为每个元素创建key和value两个内存空间，辅助空间翻倍。本例子就是用value来放index；
	 * 2、由于用value来放index，找到一个后，另外一个就马上可以得到其index。
	 * 二跟三，一个省点空间、一个省点点时间，都差别不大
	 */
	public int[] twoSum3(int[] nums,int target){
		int[] index= new int[]{0,1};
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
				index[1]=i;
				index[0]=map.get(target-nums[i]);
				return index;
			}else{
				map.put( nums[i], i);
			}
		}
		return index ;
	}

}
