package pkGameInterfa;
/**
 * 模拟游戏核心业务
 * @author mdq
 *
 */
public class AppTest {
	public static void main(String[] args){
		Hero hero1 = new Warrior(1, "战士", 23, 34);
		Castle castle = new Castle("塔", 12, 34, 100);
		hero1.PK(castle);
		castle.PK(hero1);
		
	}
}
