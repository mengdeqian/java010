package chunwan;
/**演员父类*/
public abstract class Actor {//当一个类是抽象类时，不能使用new实例化
	private String name;
	
	public Actor(){
		
	}
	public Actor(String name){
		setName(name);
	}
	/**演员的表演方法*/
	public void perform(){
		System.out.println("演员" + name + "正在表演节目");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
