package 建造者模式;

public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
        actor.setType("英雄");		
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildFace() {
		actor.setFace("英俊");
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
