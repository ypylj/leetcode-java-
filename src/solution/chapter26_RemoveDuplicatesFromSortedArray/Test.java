package solution.chapter26_RemoveDuplicatesFromSortedArray;

/**
 * @Author:  yangpeng
 * @Date:2017年8月29日下午2:11:48
 */
public class Test {
	public static void  main(String[] args) {
		int [] nums= new int[]{1,2,2,3,4,4,5,5};
		//System.out.println(new Solution().removeDuplicates2(nums));
		System.out.println(new Solution().removeDuplicates1(nums));
		 for(int i=0;i<nums.length;i++ ){
			 System.out.print(nums[i]+"  ");
		 }
	}
}
