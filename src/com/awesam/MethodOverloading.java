package com.awesam;

public class MethodOverloading {
    static double calcFeetAndInchesToCm(int feet, int inches){
        double height =0;
        if(feet>=0&&(inches>=0&&inches<=12)) {
            return ((feet*12)+inches)*2.54;
        }
        return -1;
    }
    static double calcFeetAndInchesToCm( double inches){
        int feet =0;
        int remeinder =0;
        if(inches>=0){
            feet = (int) inches/12;
            remeinder =(int) inches%12;
            System.out.println(feet+"feet "+remeinder+" inches");
            return calcFeetAndInchesToCm(feet,remeinder);
        }
         return -1;
    }
    static String format(int hours, int min, int sec){
        String hourString = hours + "h ";
        String minString = min + "m ";
        String secString = sec + "s ";
        if (hours<10)  hourString = "0"+hourString;
        if (min<10) minString = "0"+minString ;
        if (sec<10)  secString = "0"+secString;
        return  hourString + minString + secString;
    }
    static String format(int min, int sec){
        String minString = min + "m ";
        String secString = sec + "s ";
        if (min<10) minString = "0"+minString ;
        if (sec<10)  secString = "0"+secString;
        return  minString + secString;
    }
    public static String getDurationString(int min,int sec){
        int hours = 0;
        int minutes = 0;
        final String INVALID = "Invalid input";
        if(min>=0&&(sec>=0&&sec<=59)){
            hours = min/60;
            minutes = min%60;
            return format(hours,minutes,sec);
        }
      else return INVALID;
    }
    public static String getDurationString(int sec){
        int min = 0;
        int seconds = 0;
        final String INVALID = "Invalid input";
        if (sec>=0){
            min = sec/60;
            seconds = sec%60;
            System.out.println( format(min,seconds));
           return getDurationString(min,seconds);

        }
        else return INVALID;

    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCm(64));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3900));
        System.out.println(45%60);
    }
}
