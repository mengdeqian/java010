package day010;

import java.util.Scanner;

/**
 * 	�Զ���Person��ʵ�ָ���ķ�װ�������У������������Լ��������ṩһ����ӡ�����ķ�����
	�Զ���TestPerson���ͣ���main()�����д���Person��Ķ��󲢴�ӡ���ԡ�*/
public class Person {

	private String name;
	private int age;
	private String country;
	
	public void show(){
		System.out.println(this.getName() + " " + this.getAge() + " " + this.getCountry());
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public String getCountry(){
		return country;
	}
	
	
}




