package com.demo;

public class bufferString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer sb = new StringBuffer();
//		sb.append(sb.capacity());
//		sb.append("Ronaldo");
//		sb.append(sb.capacity());
//		sb.append("is a footballer");
//		sb.append(sb.capacity());
//		System.out.println(sb);
//		
//		StringBuilder bs = new StringBuilder("md");
//		sb.append("arsh");
//		System.out.println(bs);
		
		StringBuffer cb = new StringBuffer();
		cb.append(cb.capacity());
		cb.ensureCapacity(31);
		System.out.println(cb.capacity());
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append("Ronaldo"));
		sb.trimToSize();
		System.out.println((sb.capacity()));

	}

}
