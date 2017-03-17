package design.pattern.creational.factory;

import design.pattern.creational.model.*;

public class ShapeFactory implements ShapeCreator {

	@Override
	public Shape getObjectShape(String shape) {
		
		// where the actual object is to be created based on the parameter of String content
		
		Shape hugis = null;
		
		shape.toLowerCase();
		if(shape.equals("circle")){
			
			hugis = new Circle(); // runtime polymorphism
			
		}else if(shape.equals("square")){
			
			hugis = new Square(); // runtime polymorphism
			
		}else if(shape.equals("triangle")){
			
			hugis = new Triangle(); // runtime polymorphism
			
		}
		
		return hugis;
	}

}
