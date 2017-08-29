package solution.chapter27_RemoveElement;

/**
 * @Author:  yangpeng
 * @Date:2017年8月29日下午4:43:28
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
        int count=0;//3213   3   3213    0  i=0   2313  	
		for(int i=0;i<nums.length;i++){
        		if(nums[i]==val){
        			int tmp=nums[i];
        			nums[i+1]=nums[i];
        			nums[i]=tmp;
        	
        		}else{
        			count++;
        		}
        }
		return count;
    }
}
