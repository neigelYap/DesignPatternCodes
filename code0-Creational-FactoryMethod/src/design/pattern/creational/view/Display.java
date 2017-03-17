package design.pattern.creational.view;

import design.pattern.creational.model.*;

public class Display {
	
	public static void printShape(Shape shape){
		
		if(shape instanceof Circle){
			
			((Circle) shape).draw();
			
		}else if(shape instanceof Square){
			
			((Square) shape).draw();
			
		}else if(shape instanceof Triangle){
			
			((Triangle) shape).draw();
			
		}
	}
}
