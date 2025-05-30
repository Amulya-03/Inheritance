package com.inheritance;

class Employee {
	String name;
	double baseSalary;
	
	public Employee(String name, double baseSalary) {
		this.name=name;
		this.baseSalary=baseSalary;
	}
	public double calculateAnnualSalary() {
		return baseSalary*12;
	}
	
}

class Manager extends Employee{
	double bonus;
	int numberOfEmployeesManaged;
	
	public Manager(String name, double baseSalary, double bonus, int numberOfEmployeesManaged) {
		super(name,baseSalary);
		this.bonus=bonus;
		this.numberOfEmployeesManaged=numberOfEmployeesManaged;
	}
	double calculateManagerSalary() {
		return calculateAnnualSalary()+bonus;
	}
	
	
}
  class Engineer extends Employee {
	  int projectCount;
	  
	  public Engineer(String name, int baseSalary, int projectCount) {
		  super(name,baseSalary);
		  this.projectCount=projectCount;
	  }
	  double calculateEngineerSalary() {
		  return baseSalary + (projectCount*1000);
		  
	  }
  }
  
  class SalesPerson extends Employee{
	  double commissionRate;
	  double totalSales;
	  
	  public SalesPerson (String name, int baseSalary, double commissionRate,double totalSales) {
		  super(name, baseSalary);
		  this.commissionRate=commissionRate;
		  this.totalSales=totalSales;
	  }
	  double calculateSalespersonSalary() {
		  double commission= totalSales*commissionRate/100;
		  return calculateAnnualSalary() + commissionRate;
	  }
	  
  }
  public class Task2{
	  public static void main(String [] args) {
		  Employee manager=new Manager("Alice", 5000, 1000, 5);
		  System.out.println(manager.calculateAnnualSalary());
		  System.out.println(((Manager) manager) .calculateManagerSalary());
		  
		  Employee engineer=new Engineer("Bob", 70000, 5);
		  System.out.println(engineer.calculateAnnualSalary());
		  System.out.println(((Engineer)engineer).calculateEngineerSalary());
		  
		  Employee salesPerson=new SalesPerson("Charlie", 40000, 0.1, 200000);
		  System.out.println(salesPerson.calculateAnnualSalary());
		  System.out.println(((SalesPerson)salesPerson).calculateSalespersonSalary());		  
	  }
  }
