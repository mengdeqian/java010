package pkGameInterfa;
/**
 * ģ����Ϸ����ҵ��
 * @author mdq
 *
 */
public class AppTest {
	public static void main(String[] args){
		Hero hero1 = new Warrior(1, "սʿ", 23, 34);
		Castle castle = new Castle("��", 12, 34, 100);
		hero1.PK(castle);
		castle.PK(hero1);
		
	}
}
