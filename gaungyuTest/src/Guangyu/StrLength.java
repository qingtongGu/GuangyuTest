package Guangyu;
import java.util.HashMap;
import java.util.HashSet;  
import java.util.Map;
import java.util.Set;  

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class StrLength {
	
	/**
    * @param 穿进去的字符串
    * @return 返回字符串的长度 长度超过30000时返回-1
    */
	    public static Map<String, Object> maxLength(String str){  
	    	
	    	Map<String, Object> returnMap = new HashMap<String, Object>(); 
	    	//首先判断输入的字符串是否为空
	        if(str.length() > 30000){  
	        	returnMap.put("字符串长度：", "-1");
	            return returnMap;  
	        } 
	    	
	    	//首先判断输入的字符串是否为空
	        if(StringUtils.isEmpty(str)){  
	        	returnMap.put("字符串长度：", "0");
	            return returnMap;  
	        }  
	        Set<Character> set=new HashSet<Character>();  
	        int maxLength=0;  
	        int pre=0;  
	        int after=0;  
	        
	        //当字符创不为空时
	        while(after < str.length()){  
	        	
	        	//set中你不存在该字符时加入进去
	            if( ! set.contains(str.charAt( after ) )){  
	                set.add( str.charAt( after ) );  
	                after++;  
	                
	             //set中存在该字符时
	            }else{  
	                set.clear();   
	                if( ( after-pre ) > maxLength ){  
	                    maxLength = after-pre;  
	                }  
	                pre++;  
	                after = pre;  
	            }  
	        } 
	        returnMap.put("字符串长度：", maxLength);
	        return returnMap;  
	    }  
}  

