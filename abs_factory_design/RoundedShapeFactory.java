package abs_factory_design;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE"))
		{
			return new RoundedRectangle();
		}
		else if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE"))
		{
			return new RoundedSquare();
		}
		return null;
	}

}
