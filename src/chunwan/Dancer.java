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
		System.out.println("Îèµ¸ÑİÔ±" + getName() + "ÕıÔÚÌøÎè");
	}
}
