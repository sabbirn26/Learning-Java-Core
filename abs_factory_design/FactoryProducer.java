package abs_factory_design;

public class FactoryProducer {

	public static AbstractFactory getFactory(boolean rounded) {
		// TODO Auto-generated method stub
		if(rounded)
		{
			return new RoundedShapeFactory();
		}
		else {
			return new ShapeFactory();
		}
		//return null;
	}

}
