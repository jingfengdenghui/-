package mediator�н�;

public abstract class Component {
    protected Mediator mediator;
    
    public Component(Mediator m) {
    	mediator = m;
    }
    
    public void changed(){
    	mediator.componentChanged(this);
    }
    
    public abstract void update();
}
