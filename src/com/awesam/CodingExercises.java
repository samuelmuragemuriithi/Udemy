package com.awesam;

public class CodingExercises {

        public static long toMilesPerHour(double kilometersPerHour) {
            long result = kilometersPerHour<0
                ?-1
                :Math.round(kilometersPerHour/1.60934);
            return result;
        }
        public static void printConversion(double kilometersPerHour ){
            if(kilometersPerHour<0)System.out.println(" Invalid Value");
            else{
                long result= Math.round(kilometersPerHour/ 1.609);
                System.out.println( kilometersPerHour+" km/h = "+result+" mi/h ");
            }
        }
        public static void printMegaBytesAndKiloBytes(int kiloBytes){
            int megabytes = kiloBytes/1024;
            int remainder = kiloBytes%1024;
            System.out.print(kiloBytes+" KB = "+megabytes+" MB and "+remainder);
        }
        public static boolean shouldWakeUp(boolean barking,int hourofDay) {
            if(hourofDay>=0&&hourofDay<=23){
                return (hourofDay < 8 && barking) || (hourofDay > 22 && barking);
            }
            return false;
        }
        public static boolean isLeapYear(int year){
         if (year>=1&&year<=9999){
            if(year%4==0){
                if(year%100==0){
                    if (year%400==0) return true;
                        else return false;
                }
                else return true;
            }
            else return false;
         }
         return false;
        }
    public static boolean areEqualByThreePlaces(double val1,double val2){
        double num1= Math.round(val1*1000d)/1000d;
        double num2= Math.round(val2*1000d)/1000d;
        return num1 == num2;
    }
    public static boolean areEqualByThreeDecimalPlaces(double val1,double val2){
        double num1=(int) (val1*1000d)/1000d;
        double num2=(int) (val2*1000d)/1000d;
        return num1 == num2;
    }
        public static boolean hasEqualSum (int num1,int num2, int num3){
            int sum = num1 + num2;
            return sum==num3;
        }
    public static boolean hasTeen (int num1, int num2, int num3){
        if((num1>=13&&num1<=19)||(num2>=13&&num2<=19)||(num3>=13&&num3<=19))return true;
        else return false;
    }
    public static boolean isTeen(int val){
        return (val >= 13 && val <= 19);
    }

        public static double area(double radius){
            final double pi = Math.PI;
            if (radius<0)return -1;
            else {
                return pi*radius*radius;
            }
        }
        public static double area(double len, double width){
            if (len<0||width<0)return -1;
            else {
                return len*width;
            }
        }

        public static void printYearsAndDays(long minutes){
            if (minutes<0)System.out.print("Invalid Value");
            else{
                long years =minutes/525600;
                long days = (minutes%525600)/1440;
                System.out.println(minutes+" min = "+years+" y"+" and "+days+" d");
            }
        }

        public static void printEqual(int num1, int num2, int num3){
            if(num1<0||num2<0||num3<0)System.out.println("Invalid Value");
            else if(num1==num2&&num2==num3)System.out.println("All numbers are equal");
            else if(num1!=num2&&num2!=num3&&num3!=num1)System.out.println("All numbers are different");
            else System.out.println("Neither all are equal or different");
        }

        public static boolean isCatPlaying(boolean summer,int temp){
            if(summer){
                return temp>=25 &&temp<=45;
            }
            else  return temp>=25 &&temp<=35;
        }

        public static void printNumberInWord(int num){
            switch(num){
                case 0:
                    System.out.print("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;

                default:
                    System.out.println("OTHER");
            }
        }
    public static boolean isLeapYear2(int year){
        if(year<=1||year>=9999)return false;
        else{
            return((year%4==0&&year%100!=0)||year%400==0);
        }
    }
    public static int getDaysInMonth(int month,int year){
        if((month<1||month>12)||(year<=1||year>=9999))return -1;
        else{
            if(month==1)return 31;
            else if(month == 2 && isLeapYear2(year))return  29;
            else if(month == 2 && !isLeapYear2(year))return 28;
            else if(month==3)return 31;
            else if(month==4)return 30;
            else if(month==5)return 31;
            else if(month==6)return 30;
            else if(month==7)return 31;
            else if(month==8)return 31;
            else if(month==9)return 30;
            else if(month==10)return 31;
            else if(month==11)return 30;
            else if(month==12)return 31;
        }
        return -1;
    }








    public static void main(String[] args) {
        System.out.println(toMilesPerHour(80));
        printConversion(80);
        printMegaBytesAndKiloBytes(2500);
        System.out.println();
        System.out.println(shouldWakeUp(true,24));
        System.out.println(isLeapYear(1924));
        System.out.println(areEqualByThreePlaces(3.1757,3.176));
        System.out.println( areEqualByThreeDecimalPlaces(3.1757,3.176));
        int val = 13;
         boolean result = val <= 13 && val >= 19;
        System.out.println(result);
        System.out.println(area(7));
        System.out.println(area(5,4));
    }
    }


