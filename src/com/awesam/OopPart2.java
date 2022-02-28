package com.awesam;

public class OopPart2 {
    public static class Room {
        private String name;
        private wall wall1;
        private wall wall2;
        private wall wall3;
        private wall wall4;
        private ceiling ceiling;
        private Bed bed;
        private Lamp lamp;

        public Room(String name, wall wall1, wall wall2, wall wall3, wall wall4, ceiling ceiling, Bed bed, Lamp lamp) {
            this.name = name;
            this.wall1 = wall1;
            this.wall2 = wall2;
            this.wall3 = wall3;
            this.wall4 = wall4;
            this.ceiling = ceiling;
            this.bed = bed;
            this.lamp = lamp;
        }

        public Lamp getLamp() {
            return lamp;
        }

        public void makeBed() {
            System.out.println("Bed -> Making bed");
        }
    }

    public static class wall {
        private String direction;

        public wall(String direction) {
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }
    }

    public static class ceiling {
        private int height;
        private int color;

        public ceiling(int height, int color) {
            this.height = height;
            this.color = color;
        }

        public int getHeight() {
            return height;
        }

        public int getColor() {
            return color;
        }
    }

    public static class Bed {
        private String style;
        private String height;
        private int sheets;
        private int pillows;
        private int quilt;

        public Bed(String style, String height, int sheets, int pillows) {
            this.style = style;
            this.height = height;
            this.sheets = sheets;
            this.pillows = pillows;
        }

        public String getStyle() {
            return style;
        }

        public String getHeight() {
            return height;
        }

        public int getSheets() {
            return sheets;
        }

        public int getPillows() {
            return pillows;
        }

        public int getQuilt() {
            return quilt;
        }
    }

    public static class Lamp {
        private String style;
        private boolean battery;
        private int globalRating;

        public Lamp(String style, boolean battery, int globalRating) {
            this.style = style;
            this.battery = battery;
            this.globalRating = globalRating;
        }

        public void turnOn() {
            System.out.println("Lamp-> turning on");
        }

        public String getStyle() {
            return style;
        }

        public boolean isBattery() {
            return battery;
        }

        public int getGlobalRating() {
            return globalRating;
        }
    }

    public static class Printer {
        private int tonerLevel = -1;
        private int pagesPrinted;
        private boolean duplex;

        public Printer(int tonerLevel, boolean duplex) {
            if (tonerLevel > 0 && tonerLevel <= 100)
                this.tonerLevel = tonerLevel;

            this.pagesPrinted = 0;
            this.duplex = duplex;
        }

        public int addToner(int tonerAmount) {
            if (tonerAmount < 0 || tonerAmount > 100) return -1;
            else {
                tonerLevel += tonerAmount;
                if (tonerLevel > 100) return -1;
            }
            return tonerLevel;

        }

        public int printPages(int pages) {
            int pagesToPrint = pages;
            if (duplex) {
                pagesToPrint = (pages / 2) + (pages % 2);
                System.out.println("in duplex mode");
            }
            return pagesToPrint;
        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }
    }

    public static class Car {
        private boolean engine;
        private String name;
        private int wheels;
        private int cylinder;

        public Car(String name, int cylinder) {
            this.name = name;
            this.cylinder = cylinder;
            this.engine = true;
            this.wheels = 4;
        }

        public int getCylinder() {
            return cylinder;
        }

        public String getName() {
            return name;
        }

        public void startEngine() {
            System.out.println("car -> startEngine()");
        }

        public void accelerate() {
            System.out.println("car -> accelerate()");
        }

        public void brake() {
            System.out.println("car -> brake()");
        }
    }

    public static class Ford extends Car {
        public Ford(String name, int cylinder) {
            super(name, cylinder);
        }

        @Override
        public void startEngine() {
            System.out.println("Ford -> startEngine()");
        }

        @Override
        public void accelerate() {
            System.out.println("Ford -> accelerate()");
        }

        @Override
        public void brake() {
            System.out.println("Ford -> brake()");
        }
    }

    public static class Holden extends Car {
        public Holden(String name, int cylinder) {
            super(name, cylinder);
        }

        @Override
        public void startEngine() {
            System.out.println("Holden -> startEngine()");
        }

        @Override
        public void accelerate() {
            System.out.println("Holden -> accelerate()");
        }

        @Override
        public void brake() {
            System.out.println("Holden -> brake()");
        }
    }

    public static class Mitsubishi extends Car {
        public Mitsubishi(String name, int cylinder) {
            super(name, cylinder);
        }

        @Override
        public void startEngine() {
            System.out.println("Mitsubishi -> startEngine()");
        }

        @Override
        public void accelerate() {
            System.out.println("Mitsubishi -> accelerate()");
        }

        @Override
        public void brake() {
            System.out.println("Mitsubishi -> brake()");
        }
    }

    public static class Hamburger {
        private String name;
        private String meat;
        private String breadRollType;
        private int price;

        private String addition1Name;
        private int addition1Price;
        private String addition2Name;
        private int addition2Price;
        private String addition3Name;
        private int addition3Price;
        private String addition4Name;
        private int addition4Price;

        public void addHamburgerAddition1(String addition1Name, int addition1Price) {
            this.addition1Name = addition1Name;
            this.addition1Price = addition1Price;
        }

        public void addHamburgerAddition2(String addition2Name, int addition2Price) {
            this.addition2Name = addition2Name;
            this.addition2Price = addition2Price;
        }

        public void addHamburgerAddition3(String addition3Name, int addition3Price) {
            this.addition3Name = addition3Name;
            this.addition3Price = addition3Price;
        }
        public void addHamburgerAddition4(String addition4Name, int addition4Price) {
            this.addition4Name = addition4Name;
            this.addition4Price = addition4Price;
        }



        public Hamburger(String name, String meat, String breadRollType, int price) {
            this.name = name;
            this.meat = meat;
            this.breadRollType = breadRollType;
            this.price = price;
        }

        public double itemizeHamburger() {
            double hamburgerPrice = this.price;
            if (addition1Name != null) {
                hamburgerPrice += addition1Price;
                System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
            }
            if (addition2Name != null) {
                hamburgerPrice += addition2Price;
                System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
            }
            if (addition3Name != null) {
                hamburgerPrice += addition3Price;
                System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
            }
            System.out.println(this.name + " Hamburger on a " + this.breadRollType + " roll " + " with " + this.meat + " Price is: " + hamburgerPrice);

            return hamburgerPrice;
        }
    }

    public static class HealthyBurger extends Hamburger {
        private String healthyExtra1Name;
        private double healthyExtra1Price;
        private String healthyExtra2Name;
        private double healthyExtra2Price;

        public HealthyBurger(String meat, int price) {
            super("Healthy ", meat, "brown", price);
        }

        public void addHealthAddition1(String healthyExtra1Name, double healthyExtra1Price) {
            this.healthyExtra1Name = healthyExtra1Name;
            this.healthyExtra1Price = healthyExtra1Price;
        }

        public void addHealthAddition2(String healthyExtra2Name, double healthyExtra2Price) {
            this.healthyExtra2Name = healthyExtra2Name;
            this.healthyExtra2Price = healthyExtra2Price;
        }

        @Override
        public  double itemizeHamburger() {

            double hamburgerPrice = super.itemizeHamburger();
            if (healthyExtra1Name != null) {
                hamburgerPrice += healthyExtra1Price;
                System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
            }
            if (healthyExtra2Name != null) {
                hamburgerPrice += healthyExtra2Price;
                System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
            }
            return hamburgerPrice;
        }
        }

        public static class DeluxeBurger extends Hamburger{
            public DeluxeBurger() {
                super("Deluxe", " sausage and beacon", "white", 15);
                super.addHamburgerAddition1("chips",2);
                super.addHamburgerAddition2("Soda",1);
            }

            @Override
            public void addHamburgerAddition1(String addition1Name, int addition1Price) {
                System.out.println("Not Allowed");
            }

            @Override
            public void addHamburgerAddition2(String addition2Name, int addition2Price) {
                System.out.println("Not Allowed");
            }

            @Override
            public void addHamburgerAddition3(String addition3Name, int addition3Price) {
                System.out.println("Not Allowed");
            }
        }
    public static void main(String[] args) {
            wall wall1 = new wall("North");
            wall wall2 = new wall("South");
            wall wall3 = new wall("East");
            wall wall4 = new wall("West");
            ceiling myCeiling = new ceiling(10, 0000);
            Bed bed = new Bed("5*6", "medium", 2, 2);
            Lamp lamp = new Lamp("flex", true, 3);
            Room bedroom = new Room("samBedroom", wall1, wall2, wall3, wall4, myCeiling, bed, lamp);
            bedroom.makeBed();
            bedroom.lamp.turnOn();

            Printer newprinter = new Printer(50, true);
            System.out.println(newprinter.getPagesPrinted());
            System.out.println(newprinter.printPages(-1));
            System.out.println(newprinter.addToner(-1));

            Car car = new Car("carBase", 8);
            car.accelerate();
            Mitsubishi mitsubishi = new Mitsubishi("Mitsubishi", 8);
            mitsubishi.accelerate();
            Ford Ford = new Ford("Ford falcon", 8);
            Ford.accelerate();
            Holden holden1 = new Holden("Holden Commodore", 8);
            holden1.accelerate();

            Hamburger hamburger = new Hamburger("Basic ", "Sausage", "white", 5);
            double total = hamburger.itemizeHamburger();
            System.out.println("The total is: " + total);
            hamburger.addHamburgerAddition1("carrot", 1);
            hamburger.addHamburgerAddition2("tomato", 1);
            hamburger.addHamburgerAddition3("lettuce", 1);
            ;
            System.out.println("The total is: " + hamburger.itemizeHamburger());
            System.out.println();
            HealthyBurger healthyBurger = new HealthyBurger("Beacon ", 10);
            //double total2 = healthyHamburger.itemizeHamburger();
            System.out.println("The total is: " + total);
            healthyBurger.addHealthAddition1("carrot", 1);
            healthyBurger.addHealthAddition2("tomato", 1);
            System.out.println("The total is: " + healthyBurger.itemizeHamburger());
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        System.out.println("Total: "+deluxeBurger.itemizeHamburger());

        }
    }
