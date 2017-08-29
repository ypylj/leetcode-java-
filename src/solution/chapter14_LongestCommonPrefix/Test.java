package solution.chapter14_LongestCommonPrefix;

 
import java.util.Arrays;

/**
 * @Author:  yangpeng
 * @Date:2017年8月29日下午3:17:45
 */
public class Test {
	public static void main(String[] args){
		String[] strings= new String[]{};
		//System.out.println(new Solution().longestCommonPrefix1(strings));
		 System.out.println(new Solution().longestCommonPrefix3(strings));
		Arrays.sort(strings);
		for(int i=0;i<strings.length;i++){
			System.out.println(strings[i]);
		}
	}
}
