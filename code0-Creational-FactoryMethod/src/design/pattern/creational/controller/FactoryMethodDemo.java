package design.pattern.creational.controller;
import java.io.IOException;

import design.pattern.creational.factory.ShapeFactory;
import design.pattern.creational.view.*;
import utility.*;
public class FactoryMethodDemo {

	public static void main(String[] args) throws IOException{
		
		String again = "";
		do{
			Display.printShape(new ShapeFactory().getObjectShape(Reader.getString("Enter Shape: ")));
			
			again=Reader.getString("Do you like to do it again?: ");
			
		}while(again.toLowerCase().equals("yes"));
	}

}
