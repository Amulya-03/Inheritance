package com.inheritance;

class  Vechile{
	String make;
	String model;
	int year;
	
	public Vechile(String make, String model, int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
	 void displayInfo() {
		 System.out.println("Make: "+ make + "Model:"+ model + "Year:" + year);
	 }
}
	 class Car extends Vechile{
		 int numberOfDoors;
		 
		 public Car(String make, String model, int year,int numberOfDoors) {
			 super(make,model,year);
			 this.numberOfDoors = numberOfDoors;
		
	 }
       void displayCarInfo() {
    	   System.out.println("numberOfDoors: "+numberOfDoors);
       }
}
      class Truck extends Vechile{
    	  double cargoCapacity;
    	  
    	  public Truck(String make, String model, int year, double cargoCapcity) {
    		  super(make, model, year);
    		  this.cargoCapacity = cargoCapacity;
    		  
    	  }
    	  void displayTruckInfo() {
    		  System.out.println("cargoCapacity:" +cargoCapacity +"kg");
    	  }
    	  
      }
      class MotorCycle extends Vechile{
    	  boolean hasSideCar;
    	  public MotorCycle(String make, String model, int year,boolean hasSideCar) {
    		  super(make, model, year);
    		  this.hasSideCar=hasSideCar;
    		  
    	  }
    	  void displayMotorCycle() {
    		  System.out.println("hasSideCar"+hasSideCar);
    	  }
      }
      public class Task1 {
    		
      	  public static void main(String [] args) {
      		  Vechile car=new Car("Toyoto", "Corolla", 2022, 4);
      		  car.displayInfo();
      		  ((Car)car).displayCarInfo();
      		  
      		  Vechile truck=new Truck("Ford", "F-150", 2021, 1000.0);
      		  truck.displayInfo();
      		  ((Truck)truck).displayTruckInfo();
      		  
      		  Vechile motorcycle=new MotorCycle("Harely-Davidson", "Street Glide", 2023, true);
      		  motorcycle.displayInfo();
      		  ((MotorCycle)motorcycle).displayInfo();
      		  
      	  }
        }

      
      