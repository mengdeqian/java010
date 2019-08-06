package chunwan;
/**¸è³ªÑÝÔ±*/
public class Singer extends Actor {

	public Singer(){
		
	}
	public Singer(String name){
		setName(name);
	}
	@Override
	public void perform() {
		System.out.println("¸è³ªÑÝÔ±" + getName() + "ÕýÔÚ³ª¸è");
	}
}
