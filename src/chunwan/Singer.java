package chunwan;
/**�質��Ա*/
public class Singer extends Actor {

	public Singer(){
		
	}
	public Singer(String name){
		setName(name);
	}
	@Override
	public void perform() {
		System.out.println("�質��Ա" + getName() + "���ڳ���");
	}
}
