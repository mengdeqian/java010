package userDemo;

public class PatientMain {

	public static void main(String[] args){
		
		Patient pat1 = new Patient();
		pat1.setName("fsdf");
		pat1.setAge(18);
		pat1.setWeight(60);
		pat1.setSex('1');
		pat1.setAllergies(true);
		pat1.showPat();
		Patient pat2 = new Patient("meng", '1', 20, 60, false);
		pat2.showPat();
	}
}
