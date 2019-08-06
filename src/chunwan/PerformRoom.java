package chunwan;

public class PerformRoom {
	public static void main(String[] args){
		Director zhangyimou = new Director();
		Singer zyx = new Singer("zhangyixing");
		Dancer luo = new Dancer("luozhixing");
		//Actor ac = new Actor("主持人");
		zhangyimou.action(zyx);
		zhangyimou.action(luo);
		//zhangyimou.action(ac);
		
		//1、模拟程序升级：要求添加相声演员，核心代码不变
		CrossActor fenggong = new CrossActor("郭德纲");
		zhangyimou.action(fenggong);
		
		//2、要求实现main方法中的代码不修改的情况下，实现某个角色的升级
		//解决方案：使用反射+多态技术实现无缝升级
	}
}
