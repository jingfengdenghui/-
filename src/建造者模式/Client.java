package ������ģʽ;

public class Client {
    
	public static void main(String args[]) {
		//һ��������ļ���ȡ
		ActorBuilder builder = new HeroBuilder();
		
		Actor actor = builder.creatActor();
		
		System.out.println(actor.getType());
	}
}
