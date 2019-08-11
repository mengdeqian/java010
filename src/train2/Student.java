package train2;

public class Student implements Person {
	private String name;
	private String sex;
	private String birthday;

	
	@Override
	public void setData(String name, String sex, String birthday) {
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		str.append(name);
		str.append("-");
		str.append(sex);
		str.append("-");
		str.append(birthday);
		return str.toString();
	}

}
