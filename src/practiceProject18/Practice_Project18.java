package practiceProject18;
import java.util.*;

class Employee {
 private String name;
 private double salary;

 public Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
 }
}

//Inheritance
class Manager extends Employee {
 private String department;

 public Manager(String name, double salary, String department) {
     super(name, salary);
     this.department = department;
 }

 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 @Override
 public void display() {
     super.display();
     System.out.println("Department: " + department);
 }
}

//Polymorphism
class Printer {
 public void print(Employee emp) {
     emp.display();
 }
}

//Abstraction
abstract class Shape {
 abstract double area();
}

class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double area() {
     return Math.PI * radius * radius;
 }
}

public class Practice_Project18 {
 public static void main(String[] args) {
     Employee emp1 = new Employee("Harshit Goyal", 50000);
     Manager manager = new Manager("Naveen", 60000, "Marketing");

     emp1.setSalary(55000);
     manager.setDepartment("Sales");

     emp1.display();
     System.out.println();
     manager.display();

     Printer printer = new Printer();
     printer.print(emp1);
     printer.print(manager);

     Shape circle = new Circle(5.0);
     System.out.println("Area of circle: " + circle.area());
 }
}
