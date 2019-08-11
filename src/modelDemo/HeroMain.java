package modelDemo;

public class HeroMain {
	public static void main(String[] args){
		Hero hero1 = new Warrior(1, "ÄÄß¸", 187, 23);
		Hero hero2 = new Ranger(2, "³ÌÒ§½ğ", 50, 123, 23);
		Hero hero3 = new Magical(3, "Öî¸ğÁÁ", 234, 23);
		hero1.Pk(hero3);
		hero2.Pk(hero1);
		hero2.Pk(hero3);
		hero2.Pk(hero3);
	}
}
