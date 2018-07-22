package 建造者模式;

public class Client {
    
	public static void main(String args[]) {
		//一般从配置文件读取
		ActorBuilder builder = new HeroBuilder();
		
		Actor actor = builder.creatActor();
		
		System.out.println(actor.getType());
	}
}
