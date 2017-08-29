package solution.chapter9_PalindromeNumber;

/**
 * @Author:  yangpeng
 * @Date:2017年8月28日下午5:02:49
 */
// 
public class Solution {
	//将数字转成字符串的形式
public boolean isPalindrome1(int x) {
	//boolean flag;	
	if(x<0)
		return false;
      String  str=String.valueOf(x);
      for(int i=0;i<str.length()/2;i++){
    	  if(str.charAt(i)!=str.charAt(str.length()-i-1))
    		  return false;   
      }
      return true;
    }
/*??????????????????? 该方法不是很理解
 * 。如果一个数是“回文数”的话，那将这个数从中间“劈”开，两边的数字应该是互为镜像的，
 * 那我们只要证明这一点就可以说明这个数是“回文数”了。但是“镜像”又不是那么容易进行比较，
 * 所以我们需要通过一些方法把其中的一侧“镜像”正过来，然后比较和另一侧“镜像”比较是否相等，如果相等，说明之前是互为“镜像”的，
 * 否则则说明不是互为“镜像”的
 */
public boolean isPalindrome2(int x){ 
	if(x<0 ||(x%10==0 && x!=0)) return false;
	int rev=0;
	while (x>rev){  
        rev = rev*10 + x%10;  
        x = x/10; 
    }
    return (x==rev || x==rev/10);
}
//利用chapter7包中颠倒数字来进行比较
public boolean isPalindrome3(int x){
	 int m=new solution.chapter7_ReverseInteger.Solution().reverse2(x);
	 return m==x?true :false;
}

}
