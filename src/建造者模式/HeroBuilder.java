package ������ģʽ;

public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
        actor.setType("Ӣ��");		
	}

	@Override
	public void buildSex() {
		actor.setSex("��");
	}

	@Override
	public void buildFace() {
		actor.setFace("Ӣ��");
	}

	@Override
	public void buildCostume() {
		
	}

	@Override
	public void buildHairstyle() {
		
	}
    
	public Actor creatActor() {
		buildType();
		
		buildSex();
		
		buildFace();
		
		buildCostume();
		
		buildHairstyle();
		
		return actor;
	}

}
