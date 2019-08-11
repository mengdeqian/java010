package printDemo;

public class Printer {
	private IInkBox inkBox = null;
	private IPaper paper = null;
	
	public void print(String content){
		if(null == inkBox || null == paper){
			System.out.println("װ��������");
			return;
		}
		String color = inkBox.getColor();
		String type = paper.getSize();
		System.out.println("������" + color + "��ɫ");
		System.out.println("ʹ��ֽ�ųߴ�Ϊ" + type);
		System.out.println("��ӡ����Ϊ:" + content);
	}
	
	
	
	public IInkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(IInkBox inkBox) {
		this.inkBox = inkBox;
	}
	public IPaper getPaper() {
		return paper;
	}
	public void setPaper(IPaper paper) {
		this.paper = paper;
	}
	
	
}
