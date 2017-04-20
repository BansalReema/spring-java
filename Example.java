/**
 * 
 */
package com.ibm.example.test;

/**
 * @author Reema
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       
		// Testing purpose.
		String abc = new Example().truncateStr("123456789012345678901234567890" ,   31);
		//truncate( "123456789012345678901234567890" ,   25);
		//truncate( "1234567890" ,   5)
		//truncate( "123456789012345678901234567890" ,   31)
		System.out.println("======="+abc+"======="+abc.length());
		
	}
	
	/**
	 * @param str
	 * @param i
	 * @return
	 */
	public String truncateStr(String str, int i){
		
		try{
		String truncStr = "... (truncated) ...";
		String truncatedStr = null;
		int l=0, m=0, n=0;
		int k = truncStr.length();
		int j = str.length();
		if(str.isEmpty() || j <= i){
			return str;
		}else{
			if(j <= k+1 || k+1 > i){
				return str;
			}
		l = i-k;	
		m = l/2 ;
		n = l%2;
		truncatedStr = str.substring(0, m)+truncStr+str.substring(j-(m+n), j);
		return truncatedStr;
		}
		}catch(Exception e){
			//Log e. 
		}
		return str;
	}

}
