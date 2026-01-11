package main;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
	
	public static class Sphere extends Shape {
		
		//attribute/variables
		double radius = 0.0;
		double area_of_surface = 0.0;
		double volume = 0.0;
		
		//constructer
		public Sphere(double radius) {
			this.radius = radius;
		}
		
		double surface_area() {
			
			double area_of_surface = 4 * Math.PI * (radius * radius);

			return area_of_surface;
		}

		double volume() {
			
			double volume = (4.0 / 3.0) * Math.PI * (radius * radius * radius);

			return volume;
		}
		
		public String toString() {
			return "Sphere Surface Area: " + surface_area() + " " + "Sphere volume: " + volume() + " ";
		}
		
	}
	
	
	public static class Cylinder extends Shape {
		
		//attribute/variables
		double radius = 0.0;
        double height = 0.0;
		double area_of_surface = 0.0;
		double volume = 0.0;
		
		//Constructor
		public Cylinder(double radius, double height) {
			this.radius = radius;
            this.height = height;
		}
		
		@Override
		double surface_area() {
			
			double area_of_surface = 2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius);

			return area_of_surface;
		}

		@Override
		double volume() {
				
			volume = Math.PI * (radius * radius) * height;
				
			return volume;
			}
		
		public String toString() {
			return "Cylinder Surface Area: " + surface_area() + " " + "Cylinder volume: " + volume() + " ";
			
		}
	}
		
		public static class Cone extends Shape {
			
			//attributes/variables
			double radius = 0.0;
			double height = 0.0;
			double area_of_surface = 0.0;
			double volume = 0.0;
			
			public Cone(double radius, double height) {
				
				this.radius = radius;
				this.height = height;
			}

			@Override
			double surface_area() {
	
				area_of_surface = Math.PI * radius * (radius + Math.sqrt((radius * radius) + (height + height)));
					
				return area_of_surface;
					
				}

			@Override
			double volume() {
					
					volume = Math.PI * (radius * radius) * (height / 3);
					
					return volume;
					
				}
			
		
			

		
		public String toString() {
			return "Cone Surface Area: " + surface_area() + " " + "Cone volume: " + volume() + " ";
			
		}
		
		}
	
		public static void main(String [] args) {
			
			//variables
			double radius = 0.0;
			double height = 0.0;
			int check = 0;
			
			//array creation
			ArrayList<Shape> shapeArray = new ArrayList<Shape>();
			
			//get user input creation
			Scanner user_input = new Scanner(System.in);
			
			//create one of each shape
			while (check == 0) {
				
				try {
					System.out.print("Please enter Radius of Sphere: ");
					radius = user_input.nextDouble();
					check = 1;
				}
				catch (Exception e) {
					System.out.print("Error: Please enter in 00.00 format");
					System.out.print("Please enter Radius of Sphere: ");
					radius = user_input.nextDouble();
					check = 0;
				}
				
			}
			
			
			Sphere sphere_1 = new Sphere(radius); 

			while (check == 1) {
				
				try {
					System.out.print("Please enter Radius of Cone: ");
					radius = user_input.nextDouble();
					check = 0;
				}
				
				catch (Exception e) {
					System.out.print("Error: Please enter in 00.00 format");
					System.out.print("Please enter Radius of Cone: ");
					radius = user_input.nextDouble();
					check = 1;
				}
				
			}
				
				while (check == 0) {
					
					try {
						System.out.print("Please enter Height of Cone: ");
						height = user_input.nextDouble();
						check = 1;
					}
					catch (Exception e) {
						System.out.print("Error: Please enter in 00.00 format");
						System.out.print("Please enter Height of Cone: ");
						height = user_input.nextDouble();
						check = 0;
					}
					
	
			}

			
			Cone cone_1 = new Cone(radius, height);
			
			//get cylinder input
			
			while (check == 1) {
				
				try {
					System.out.print("Please enter Radius of Cylinder: ");
					radius = user_input.nextDouble();
					check = 0;
				}
				
				catch (Exception e) {
					System.out.print("Error: Please enter in 00.00 format");
					System.out.print("Please enter Radius of Cylinder: ");
					radius = user_input.nextDouble();
					check = 1;
				}
				
			}
				
				while (check == 0) {
					
					try {
						System.out.print("Please enter Height of Cylinder: ");
						height = user_input.nextDouble();
						check = 1;
					}
					catch (Exception e) {
						System.out.print("Error: Please enter in 00.00 format");
						System.out.print("Please enter Height of Cylinder: ");
						height = user_input.nextDouble();
						check = 0;
					}
					
	
			}
			    Cylinder cylinder_1 = new Cylinder(radius, height);					
			    user_input.close();	
			    
			    //enter all shapes into array
			    shapeArray.add(cylinder_1);
			    shapeArray.add(cone_1);
			    shapeArray.add(sphere_1);
			    
			    //print out array
			    for (Shape i : shapeArray) {
			    	System.out.print(i);
			    }


		}
		
		
		
}