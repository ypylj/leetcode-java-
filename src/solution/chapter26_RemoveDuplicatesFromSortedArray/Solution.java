package solution.chapter26_RemoveDuplicatesFromSortedArray;

/**
 * @numsuthor:  yangpeng
 * @Date:2017年8月29日上午11:48:15
 */
//给定一个排序数组，去掉数组重复元素，并返回数组中元素的个数
public class Solution {
	/**
	 * 错误
	 * @param nums
	 * @return
	 */
	
	public int removeDuplicates1(int[] nums){
		if(nums.length==0||nums.length==1)
			return nums.length==0?0:1;
		int count=1;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i+1]!=nums[i]){
				count ++;
				
			}else{
				if(i+2<=nums.length-2){
					nums[i+1]=nums[i+2];	
				}
		 	}
		}
		return count;
	}
	/**
	 * @param nums
	 * @return int 
	 */
	public int removeDuplicates2(int[] nums) {  
        if (nums.length == 0) {  
            return 0;  
        }  
        int current = 1;  
         int index = 1;  
        //int pre = nums[0];  
        while (index < nums.length) {  
            if (!(nums[index] == nums[0])) {  
                nums[current++] = nums[index];  
            }  
            nums[0] = nums[index];  
            index++;  
        }  
        return current;  
    }
	 
}
