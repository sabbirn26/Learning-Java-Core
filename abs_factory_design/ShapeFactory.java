package abs_factory_design;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		return null;
	}

}
