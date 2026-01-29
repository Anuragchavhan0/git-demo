package com.demo;

public class charArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		char[] ch = a.toCharArray();
		for (int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]=='0')continue;
			
			for(int j=i+1;j<ch.length;j++) {
				if (ch[i]==ch[j]) {
					count++;
					ch[j]='0';
					
				}
			}
			System.out.println(ch[i] + " : " + count);
		}

	}

}
