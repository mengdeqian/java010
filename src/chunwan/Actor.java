package chunwan;
/**��Ա����*/
public abstract class Actor {//��һ�����ǳ�����ʱ������ʹ��newʵ����
	private String name;
	
	public Actor(){
		
	}
	public Actor(String name){
		setName(name);
	}
	/**��Ա�ı��ݷ���*/
	public void perform(){
		System.out.println("��Ա" + name + "���ڱ��ݽ�Ŀ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
