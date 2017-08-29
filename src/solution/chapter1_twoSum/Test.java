package solution.chapter1_twoSum;

/**
 * @Author:  yangpeng
 * @Date:2017年8月28日下午3:27:25
 */
public class Test {
	public static void main(String[] args){
		Solution solution=new Solution();
		int[] nums={5,2,7,4,9,6};
		 //int[] index=solution.twoSum1(nums, 4);
		//int[] index=solution.twoSum2(nums, 8);
		int[] index=solution.twoSum3(nums, 8);
		
		System.out.print(index[0]+"  "+index[1]);
	}
}
