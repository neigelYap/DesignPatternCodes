package design.pattern.creational.factory;

import design.pattern.creational.model.Shape;

public interface ShapeCreator {
	
	Shape getObjectShape(String shape);
}
