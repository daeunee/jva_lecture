package com.yrdomain.ch04;

public class SwtichCharEx {
	public static void main(String []args) {
		char grade = '��';
		
		switch(grade)
		{
		case 'A':
		case 'a':
			 System.out.println("���ȸ���Դϴ�.");
			 break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ���Դϴ�.");
			 break;
			 default:
				 System.out.println("�մ��Դϴ�.");
		}		
		
	}
	

}