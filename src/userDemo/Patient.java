package userDemo;

public class Patient {

	private String name;
	private char sex;
	private int age;
	private float weight;
	private boolean allergies;
	
	public void showPat(){
		System.out.println(this.getName());
		System.out.println(this.getAge());
		System.out.println(this.getSex());
		System.out.println(this.getWeight());
		System.out.println(this.isAllergies());
	}
	
	public Patient(){
		
	}
	public Patient(String name, char sex, int age, float weight, boolean allergies){
		setName(name);
		setSex(sex);
		setAge(age);
		setWeight(weight);
		setAllergies(allergies);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public boolean isAllergies() {
		return allergies;
	}
	public void setAllergies(boolean allergies) {
		this.allergies = allergies;
	}
	
}
