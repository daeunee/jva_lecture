package com.yrdomain.ch07;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();
}