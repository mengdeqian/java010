package printDemo;

public class Printer {
	private IInkBox inkBox = null;
	private IPaper paper = null;
	
	public void print(String content){
		if(null == inkBox || null == paper){
			System.out.println("装置有问题");
			return;
		}
		String color = inkBox.getColor();
		String type = paper.getSize();
		System.out.println("以下是" + color + "颜色");
		System.out.println("使用纸张尺寸为" + type);
		System.out.println("打印内容为:" + content);
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
