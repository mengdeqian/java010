package day010;

import java.util.Scanner;

/**
 * 	自定义Person类实现该类的封装，特征有：姓名、年龄以及国籍，提供一个打印特征的方法。
	自定义TestPerson类型，在main()方法中创建Person类的对象并打印特性。*/
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




