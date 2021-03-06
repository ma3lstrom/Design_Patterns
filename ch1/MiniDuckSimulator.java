package ch1;

/**
 *	Strategy Pattern example: 
 *	Defines a family of algorithms, encapsulates them and 
 *	makes them interchangeable.  
 *
 */
public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();		// calls object in ModelDuck constructor
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
