package com.yrdomain.ch11;

public class Member3 implements Cloneable {

	public String name;
	public int age;
	public int[] scores; 
	public Car car;  
	
	public Member3(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member3 cloned = (Member3) super.clone(); 
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); // clone()�޼ҵ� ������
		// car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	public Member3 getMember() {
		Member3 cloned = null;
		try {
			cloned = (Member3) clone(); // �����ǵ� clone() �޼��� ȣ��
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
}