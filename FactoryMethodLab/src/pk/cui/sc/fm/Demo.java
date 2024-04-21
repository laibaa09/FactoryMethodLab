package pk.cui.sc.fm;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		//using single factory to create multiple shape instance

		GeometeryFactory Factory = GeometeryFactory.getInstance();
		
		shapes.add(Factory.createShape("Circle"));
		shapes.add(Factory.createShape("square"));
		shapes.add(Factory.createShape("triangle"));
		
		for(Shape s:shapes){
				s.draw();
			 }
		// CricleGeometry cricleGeomerty = new CricleGeometry();
		// SquareGeometry squareGeometry = new SquareGeometry();
		// TriangleGeometry triangleGeometry = new TriangleGeometry();
		
		// shapes.add(cricleGeomerty.createShape());
		// shapes.add(squareGeometry.createShape());
		// shapes.add(squareGeometry.createShape());
		// shapes.add(triangleGeometry.createShape());
		
		// for(Shape s:shapes){
		// 	s.draw();
		// }

	}

}
