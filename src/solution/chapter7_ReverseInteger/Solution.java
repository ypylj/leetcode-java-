package solution.chapter7_ReverseInteger;
/*
 * Reverse Interger 整数反转
 */
/**
 * @Author:  yangpeng
 * @Date:2017年8月28日下午4:22:42
 */
public class Solution {
	//利用StringBuilder的字符串反转函数，但是存在反转后的数字发生溢出的情况， 
	public int reverse1(int x) {  
		   String str=String.valueOf(x);
		 
		   if(x>=0){
			String str2 =	new StringBuilder(str).reverse().toString();
			if(Long.parseLong(str2)>Integer.MAX_VALUE){
				return 0;
			}else{
	        return Integer.parseInt(str2) ;
			}
		}else{
			String  str2= new StringBuilder(str.substring(1, str.length())).reverse().toString();
			if(Long.parseLong(str2)>Integer.MAX_VALUE){
				return 0;
			}else{
				return -Integer.parseInt(str2);
			}
			
		}
	    
	}
	//利用求余法  但是存在反转后的数字发生溢出的情况， 
	public int reverse2(int x){
		long result=0;//使用long 类型保存结果数据，防止溢出问题
		int tmp=Math.abs(x);//取绝对值
		while(tmp>0){
		result*=10;	
		result+=tmp%10;//取余
		if(result>Integer.MAX_VALUE)
			return 0;
		tmp=tmp/10;
		}
	
		 return (int) (  x>=0?result:-result);
	}
	
}
