package chunwan;

public class Dancer extends Actor{
	public Dancer(){
		super();
	}
	public Dancer(String name){
		super(name);
	}
	@Override
	public void perform() {
		System.out.println("�赸��Ա" + getName() + "��������");
	}
}
