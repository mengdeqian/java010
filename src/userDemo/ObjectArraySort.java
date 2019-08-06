package userDemo;
/**
 * 对象数组排序实例
 * */
public class ObjectArraySort {
	
	public static void sort(Hero[] heroArray){
		Hero tempHero = null;
		for(int i = 0; i < heroArray.length; i++){
			for(int j = 0; j < heroArray.length - 1; j++){
				if(heroArray[j].compareToByName(heroArray[j + 1]) < 0){
					tempHero = heroArray[j];
					heroArray[j] =  heroArray[j + 1];
					heroArray[j + 1] = tempHero;
				}
			}
		}
	}
	
	
	public static void main(String[] args){
		Hero wa1 = new Warrior();
		Warrior wa2 = new Warrior();
		Warrior wa3 = new Warrior();
		Warrior wa4 = new Warrior();
		Warrior wa5 = new Warrior();
		Archmage ar1 = new Archmage();
		Archmage ar2 = new Archmage();
		Archmage ar3 = new Archmage();
		Archmage ar4 = new Archmage();
		Archmage ar5 = new Archmage();
		Hero[] heroArray = {
				wa1, wa2, wa3, wa4, wa5,
				ar1, ar2, ar3, ar4, ar5
		};
		System.out.println("排序前:");
		System.out.println("级别\t名称\tMaxHp\tHp\t攻击力");
		for(Hero hero: heroArray){
			System.out.println(hero);
		}
		System.out.println("排序后:");
		sort(heroArray);
		for(Hero hero: heroArray){
			System.out.println(hero);
		}
	}
	
}
