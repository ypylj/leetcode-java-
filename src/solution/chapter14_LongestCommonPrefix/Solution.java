package solution.chapter14_LongestCommonPrefix;

import java.util.Arrays;

/**
 * @Author:  yangpeng
 * @Date:2017年8月29日下午3:08:46
 */
//在字符串数组中寻找最长的字符串前缀
public class Solution {
	 public String longestCommonPrefix1(String[] strs) {
		 if(strs.length==0||strs==null)
			 return "";
		  for(int i=1;i<strs.length;i++){
			  if(strs[i]==""||strs[i].length()==0)
				  return "";
	        strs[0]=strs[0].substring(0, Math.min(strs[i].length(), strs[0].length()));//取
	        for(int j=0;j<strs[0].length();j++){
	        		
	        		if(strs[i].charAt(j)!=strs[0].charAt(j)) 
	        			
	        			strs[0]=strs[0].substring(0, j);
	        	}
	        }
		 return strs[0];
	    }
	 
	 public  String longestCommonPrefix2(String[] strs){
		 if(strs.length==0) return "";
		 String pre=strs[0];
		 for(int i=1;i<strs.length;i++){
			 while(strs[i].indexOf(pre)!=0)//与上边的方法类似，只是利用String的indexOf()函数,判断该字符串是不是出现在str[i]的最前面
				 pre=pre.substring(0, pre.length()-1);//从后往前不断匹配前缀字符串
		
		 }
		 return pre;
		 
	 }
	 /*
	  * 1、先将数组进行排序，
	  * 2、再比较第一个字符串和最后一个字符串来得出最长公共字符串
	  */
	 public String longestCommonPrefix3(String[] strs){
		 if(strs.length==0)
			 return "";
		 Arrays.sort(strs);//按照字典顺序进行排序
		for(int i=0;i<strs[0].length();i++){
			if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i))
				strs[0]=strs[0].substring(0, i);
		}
		 return strs[0] ;
	 }
	 
}
