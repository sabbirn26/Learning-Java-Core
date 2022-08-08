package abs_factory_design;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	      //get an object of Shape Rectangle
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape1.Draw();
	      
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	      //get an object of Shape Rectangle
	      Shape shape2 = shapeFactory1.getShape("ROUNDEDSQUARE");
	      //call draw method of Shape Rectangle
	      shape2.Draw();

	}

}
