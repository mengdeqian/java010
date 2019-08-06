package chunwan;

public class CrossActorV1 extends Actor{

	public CrossActorV1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CrossActorV1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void perform() {
		System.out.println("第二类相声演员" + getName());
	}
}
