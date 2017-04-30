package com.santosh.challege;

public class CandidateCode {

	public static String longestIncreasingSubsequence(String input1){
		String result="";
		char[] charArray=input1.toCharArray();
		for(int i=0;i<input1.length();i++){
			System.out.println();
			int currPos=charArray[i];
			int nextPos;
			if(i==input1.length()-1){
				nextPos=charArray[i-1];
			}else{
				nextPos=charArray[i+1];
			}
			if(currPos <=nextPos){
				result+=input1.charAt(i);
				System.out.println(result);
			}else if(i==input1.length()-1 &&currPos> nextPos){
				result+=input1.charAt(i);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		//String ip1="abcbcbcd";
		//String ip1="dddzzba";
		//String ip1="aabcbcd";
		String ip1="cdefdefed";
		
		//String ip1="bbbcdcdef";
		String output;
		output=longestIncreasingSubsequence(ip1);
		System.out.println(String.valueOf(output));

	}

}
