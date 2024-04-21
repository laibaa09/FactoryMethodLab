package pk.cui.sc.fm;

public class GeometeryFactory extends Geometery {
    // Singleton instance
    private static GeometeryFactory instance;

    // Private constructor to prevent instantiation
    private GeometeryFactory() {
    }

    // Method to get the Singleton instance
    public static GeometeryFactory getInstance() {
        if (instance == null) {
            instance = new GeometeryFactory();
        }
        return instance;
    }

    @Override
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }

   

  
}