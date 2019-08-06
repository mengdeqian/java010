package chunwan;

public class CrossActor extends Actor {
	public CrossActor(){
		super();
	}
	public CrossActor(String name){
		super(name);
	}
	@Override
	public void perform() {
		System.out.println(getName() + "ËµÑ§¶º³ª");
	}
}
