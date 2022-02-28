package com.awesam;

public class OopPart1 {
    public class SimpleCalculator {
        private double firstNumber;
        private double secondNumber;
        public double getFirstNumber(){
            return firstNumber;
        }
        public double getSecondNumber(){
            return secondNumber;
        }
        public void setFirstNumber(double firstNumber){
            this.firstNumber=firstNumber;
        }
        public void setSecondNumber(double secondNumber){
            this.secondNumber=secondNumber;
        }
        public double getAdditionResult(){
            return firstNumber+secondNumber;
        }
        public double getSubtractionResult(){
            return firstNumber-secondNumber;
        }
        public double getMultiplicationResult(){
            return firstNumber*secondNumber;
        }
        public double getDivisionResult(){
            if(secondNumber==0){
                return 0;
            }
            return firstNumber/secondNumber;
        }
    }

    public class Person {
        private String firstName;
        private String lastName;
        private int age;
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }

        public void setFirstName(String firstName){
            this.firstName= firstName;
        }
        public void setLastName(String lastName){
            this.lastName= lastName;
        }
        public void setAge(int age){
            if(age<0||age>100){
                age = 0;
            }
            this.age= age;
        }
        public boolean isTeen(){
            return age>12&&age<20;
        }
        public String getFullName(){
            if(firstName.isEmpty() && lastName.isEmpty())return "";
            else if(firstName.isEmpty())return lastName;
            else if(lastName.isEmpty())return firstName;
            else return firstName+" "+lastName;
        }
    }

    public static class bankAccount{
        private int balance;
        private String customersName;
        private String email;
        private long phoneNumber;
        public int getBalance(){
            return balance;
        }
        public String getName(){
            return customersName;
        }
        public String getEmail(){
            return email;
        }
        public long getPhoneNumber(){
            return phoneNumber;
        }
        public void setBalance(int balance){
            this.balance= balance;
        }
        public void setCustomersName(String customersName){
            this.customersName= customersName;
        }
        public void setEmail(String email){
            this.email= email;
        }
        public void setPhoneNumber(long phoneNumber){
            this.phoneNumber= phoneNumber;
        }
        public void deposit(int amount){
           this.balance+=amount;
        }
        public void withdraw(int amount){
            if(this.balance-amount<0) System.out.println("Insufficient Funds!");
           else {
               this.balance-=amount;
                System.out.println("withdrawal of: "+amount+" processed and balance is: "+this.balance);
            }
        }
    }

    public static class VipCustomer{
        private String name;
        private double creditLimit;
        private String email;
        public VipCustomer(String name, String email) {
            this(name,1000000,email);
        }
        public VipCustomer(String name, double creditLimit, String email) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.email = email;
        }

        public VipCustomer() {
            this("Default name",1000000,"org.email");
        }

        public String getName() {
            return name;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public String getEmail() {
            return email;
        }
    }
    public static class Wall {
        public Wall(double width, double height) {
            if (width<0)width=0;
            if (height<0)height=0;
            this.width = width;
            this.height = height;
        }
        public Wall() {
        }

        private double width;
        private double height;

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            if (width<0)width=0;
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            if (height<0)height=0;
            this.height = height;
        }
        public double getArea() {
            return this.height*this.width;
        }
    }

    public static class Point {
        private int x;
        private int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
        public double distance(){
            return Math.sqrt((x*x)+(y*y));
        }
        public double distance(int a,int b){
            return Math.sqrt(((this.x-a)*(this.x-a))+((this.y-b)*(this.y-b)));
        }
        public double distance(Point point2){
            return point2.distance(x,y);
        }
    }
    public class Floor {
        private double width;
        private double length;

        public Floor(double width, double length) {
            if (width<0)width=0;
            if (length<0)length=0;
            this.width = width;
            this.length = length;
        }

        public double getArea(){
            return this.width*this.length;
        }
    }
    public class Carpet{
        private double cost;

        public double getCost() {
            return cost;
        }

        public Carpet(double cost) {
            if (cost<0)cost=0;
            this.cost = cost;
        }
    }
    public class Calculator{
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost(){
            return floor.getArea()*carpet.getCost();
        }
    }

    public static class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public double getReal() {
            return real;
        }

        public double getImaginary() {
            return imaginary;
        }
        public  void add(double a, double b){
            this.real= real+a;
            this.imaginary= imaginary+b;
        }
        public void add(ComplexNumber complex){
           double x = complex.getReal();
            double y = complex.getImaginary();
            this.real= real+x;
            this.imaginary= imaginary+y;
        }
        public void subtract(double a, double b){
            real=this.real-a;
            imaginary= this.imaginary-b;
        }
        public void subtract(ComplexNumber complex){
            double x = complex.getReal();
            double y = complex.getImaginary();
            real= this.real-x;
            imaginary= this.imaginary-y;
        }
    }

    public static class Vehicle {
        private String name;
        private String size;

        private int currentVelocity;
        private int currentDirection;

        public Vehicle(String name, String size) {
            this.name = name;
            this.size = size;

            this.currentVelocity = 0;
            this.currentDirection = 0;
        }

        public void steer(int direction) {
            this.currentDirection += direction;
            System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
        }

        public void move(int velocity, int direction) {
            currentVelocity = velocity;
            currentDirection = direction;
            System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

        }

        public String getName() {
            return name;
        }

        public String getSize() {
            return size;
        }

        public int getCurrentVelocity() {
            return currentVelocity;
        }

        public int getCurrentDirection() {
            return currentDirection;
        }

        public void stop() {
            this.currentVelocity = 0;
        }
    }
    public static class Car extends Vehicle {

        private int wheels;
        private int doors;
        private int gears;
        private boolean isManual;

        private int currentGear;

        public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
            super(name, size);
            this.wheels = wheels;
            this.doors = doors;
            this.gears = gears;
            this.isManual = isManual;
            this.currentGear = 1;
        }

        public void changeGear(int currentGear) {
            this.currentGear = currentGear;
            System.out.println("Car.setCurrentGear(): Change to " + this.currentGear + " gear.");
        }

        public void changeVelocity(int speed, int direction) {
            move(speed,direction);
            System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        }

    }
    public static class porshe extends Car{
        private int roadServiceMonth;
        public porshe(int roadServiceMonth) {
            super("porshe", "4WD", 4, 4, 5, false);
            this.roadServiceMonth =roadServiceMonth;
        }
        public void accelerate(int rate){
          int newVelocity=getCurrentVelocity()+rate;
          steer(45);
          if (newVelocity==0){
              stop();
              changeGear(1);
          }
          if (newVelocity<=10)changeGear(2);
          else   if (newVelocity<=20)changeGear(3);
          else   if (newVelocity<=30)changeGear(4);
          else   if (newVelocity<=40)changeGear(5);
          else changeGear(5);
          if (newVelocity>0)changeVelocity(newVelocity,getCurrentDirection());
        }
    }

    public static class Circle {
        private double radius;



        public Circle (double radius) {
            if (radius<0)radius=0;
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
        public double getArea() {
            return Math.PI*radius*radius;
        }
    }

    public static class Cylinder extends Circle {
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
            if (height<0)height=0;
            this.height = height;
        }

        public double getHeight() {
            return height;
        }
        public double getVolume() {
            return height*getArea();
        }
    }

    public class Rectangle {
        private double width;
        private double length;
        public Rectangle(double width, double length) {
            if (width<0)width=0;
            if (length<0)length=0;
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }
        public double getArea() {
            return length*width;
        }


    }
    public class Cuboid extends Rectangle {
        private double height;

        public Cuboid(double width, double length, double height) {
            super(width, length);
            if (height<0)height=0;
            this.height = height;
        }
        public double getHeight() {
            return height;
        }
        public double getVolume() {
            return height*getArea();
        }

    }


    public static void main(String[] args) {
        bankAccount ba = new bankAccount();
        ba.setBalance(1000);
        ba.deposit(500);
        System.out.println(ba.getBalance());
        ba.withdraw(200);
        ba.getBalance();

        VipCustomer sam = new VipCustomer();
        System.out.println(sam.getCreditLimit());
        System.out.println(sam.getEmail());
        System.out.println(sam.getName());
        VipCustomer ruth = new VipCustomer("ruth", "ruth.com");
        System.out.println(ruth.getEmail());

        Wall wall = new Wall();
        System.out.println(wall.getArea());
        wall.setHeight(10);
        wall.setWidth(10);
        System.out.println(wall.getArea());

        Point point = new Point(6, 5);
        Point point2 = new Point(3, 1);
        System.out.println(point.distance());
        System.out.println(point.distance(2, 2));
        System.out.println(point.distance(point2));

        ComplexNumber complexNumber = new ComplexNumber(1, 1);
        ComplexNumber complexNumber1 = new ComplexNumber(2.5, 3.5);
        complexNumber.add(1, 1);
        System.out.println("a" + complexNumber.getImaginary());
        System.out.println("a" + complexNumber.getReal());
        complexNumber.add(complexNumber1);
        System.out.println("b" + complexNumber.getImaginary());
        System.out.println("b" + complexNumber.getReal());

        complexNumber.subtract(complexNumber1);
        System.out.println("c" + complexNumber.getImaginary());
        System.out.println("c" + complexNumber.getReal());
    porshe porshe1=new porshe(7);
    porshe1.accelerate(30);

    Circle circle= new Circle(10);
        System.out.println(circle.getArea());
        Cylinder cylinder=new Cylinder(10,10);
        System.out.println(cylinder.getVolume());

    }
}

