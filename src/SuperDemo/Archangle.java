package SuperDemo;
/**
 * 超级英雄实现了三个接口
 * @author mdq
 *
 */
public class Archangle implements IFly,IRunning,IShipping {

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("i can swim");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("i can run");
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		System.out.println("i can fly");
	}
	

}
