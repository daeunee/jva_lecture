package com.yrdomain.ch11;

public class KeyBoardToStringEx {

	public static void main(String[] args) throws IOException{
		byte[] bytes= new byte[100];
		
		System.out.println("�Է�: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes,0,readByteNo-2);
		System.out.print(str);		

	}

}