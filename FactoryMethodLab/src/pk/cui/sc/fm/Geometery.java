package pk.cui.sc.fm;

public abstract class Geometery {
	//remove shapetype argument for diffrent factory
	public abstract Shape createShape(String shapeType);
}
