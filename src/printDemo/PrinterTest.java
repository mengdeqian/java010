package printDemo;

public class PrinterTest {
	public static void main(String[] args){
		Printer printer = new Printer();
		printer.setInkBox(new ColorInkBoxImpl());
		printer.setPaper(new AFourPaper());
		
		printer.print("²âÊÔÄÚÈİ");
	}
}
