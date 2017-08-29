package solution.chapter13_RomanToInteger;

/**
 * @Author:  yangpeng
 * @Date:2017年8月29日上午8:58:56
 */
 /*
  * 罗马数字在构成数字的时候，有下列规则：

	1、相同的数字连写，所表示的数等于这些数字相加得到的数，如：Ⅲ = 3；

	2、小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数， 如：Ⅷ = 8；Ⅻ = 12；

	3、小的数字，（限于Ⅰ、X 和C）在大的数字的左边，所表示的数等于大数减小数得到的数，如：Ⅳ= 4；Ⅸ= 9；

	4、正常使用时，连写的数字重复不得超过三次。IX
  */
public class Solution {
	public int romanToInt(String s){
		int sum=0;     
		int  len=s.length();
		for(int i=len-1;i>=0;i--){
			if(s.charAt(i)=="I".charAt(0)){
				sum++;
				continue;
			}
			if(s.charAt(i)=="X".charAt(0)||s.charAt(i)=="V".charAt(0)){
				
				if(s.charAt(i)=="X".charAt(0)){
					sum=sum+10;
				}else{
					sum=sum+5;
				}
				if(i>=1&&s.charAt(i-1)=="I".charAt(0)){
					 sum=sum-1;
					 i--;
				}
				continue;
				 
			}
			if(s.charAt(i)=="L".charAt(0)||s.charAt(i)=="C".charAt(0)){
				
				if(s.charAt(i)=="L".charAt(0)){
					sum=sum+50;
				}else{
					sum=sum+100;
				}
				if(i>=1&&s.charAt(i-1)=="X".charAt(0)){
					sum=sum-10;
					i--;
				}
				continue;
			}
			
			if(s.charAt(i)=="D".charAt(0)||s.charAt(i)=="M".charAt(0)){
				
				if(s.charAt(i)=="D".charAt(0)){
					sum=sum+500;
				}else{
					sum=sum+1000;
				}
				if(i>=1&&s.charAt(i-1)=="C".charAt(0)){
					sum=sum-100;
					i--;
				}
				continue;
			}
		}
		return sum;
	}
}
