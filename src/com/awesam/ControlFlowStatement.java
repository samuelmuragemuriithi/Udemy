package com.awesam;

public class ControlFlowStatement {
    static  void caseExpression(char switchVal){
        switch (switchVal){
            case 'a':
                System.out.println("a found");
                break;
            case 'b':
                System.out.println("b found");
                break;
            case  'c':
                System.out.println("c found");
                break;
            case 'd':
                System.out.println("d found");
                break;
            case 'e':
                System.out.println("e found");
                break;
            default:
                System.out.println("Not a, b, c, d, and e");
        }
    }
    static void printDayOfTheWeek(int day){
        switch (day){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
    static void printDays(int day){
        if (day==1) System.out.println("Monday");
        else if (day==2) System.out.println("Tuesday");
        else if (day==3) System.out.println("Wednesday");
        else if (day==4) System.out.println("Thursday");
        else if (day==5) System.out.println("Friday");
        else if (day==6) System.out.println("Saturday");
        else if (day==7) System.out.println("Sunday");
        else System.out.println("Invalid Day");
    }
    public static double calcInterest(double amount,double interest){
        return amount*(interest/100);
    }
    public static boolean isPrime(int n){
    if (n==1)return false;
     for (int i = 2; i <=(int)Math.sqrt(n) ; i++) {
            if(n%i == 0)return false ;
        }
        return true;
    }
    public static boolean isDivisible(int num){
        return num%3==0&&num%5==0;
    }
    public static boolean isOdd(int number) {
        if (number < 0) return false;
        else {
            return number % 2 != 0;
        }
    }
        public static boolean isEven(int number){
            if(number<0)return false;
            else{
                return number%2 ==0;
            }
    }
    public static int sumOdd(int start,int end){
        if(start<0||end<0||start>end)return -1;
        int count =0;
        int sum =0;
        for(int i=start;i<=end;i++){
            if (isOdd(i)){
                sum+=i;
            }

        }
        return sum;
    }
    public static  int sumDigits(int num){
        int sum =0;
        if (num<=9) return -1;
        while(num>0){
          int rem=num%10;
          num= num/10;
          sum+=rem;
        }
        return sum;
    }
    public static boolean isPalindrome(int num){
        int reverse = 0;
        int val = num;
        if (val<0)val=-val;
        if (num<0) num = -num;
            while (num > 0) {
                int rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;
            }
        return val==reverse;
    }
    public static int sumFirstLast(int num){
        if (num<0)return -1;
        int val1=num%10;
        int reverse =0;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num/=10;
        }
        int val2=reverse%10;
        return val1+val2;
    }

    public static int getEvenDigitSum(int number){
        if(number<0)return -1;
        int sum = 0;
        while(number>0){
            int rem =number%10;
            number/=10;
            if(rem%2==0)sum+=rem;
        }
        return sum;
    }



    public static boolean hasSharedDigit(int num1,int num2){
        if ((num1<10||num1>=100)||(num2<10||num2>=100))return false;
        int val1=num2;
        while(num1>0){
            int rem =num1%10;
            num1/=10;
            num2=val1;
            while(num2>0){
                int rem2=num2%10;
                num2/=10;
                if (rem==rem2)return true;
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        if(isValid(num1)&&isValid(num2)&&isValid(num3)){
            int rem1 =num1%10;
            int rem2 =num2%10;
            int rem3 =num3%10;
            return rem1==rem2||rem1==rem3||rem2==rem3;
        }
        return false;
    }
    public static boolean isValid(int num){
        return num>=10&&num<=1000;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10||second<10)return -1;
        int min =0;
        int gcd = 1;
        if(first<second) min = first;
        else min = second;
        for(int i=min;i>=1;i--){
            if(first%i==0&&second%i==0){
                return i;
            }
        }
        return -1;
    }

    public static void printFactors(int number){
        if(number<1)System.out.println("Invalid Value");
        for(int i=1;i<=number;i++){
            if(number%i==0) System.out.print(i+" ");
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number<1)return false;
        int sum =0;
        for(int i=1;i<number;i++){
            if(number%i==0)sum+=i;
        }
        return sum==number;
    }

    public static void numberToWords(int number){
        int val=number;
        if(number<0)System.out.println("Invalid Value");
        int before =getDigitCount(number);

        number = reverse(number);
        int after =getDigitCount(number);

        if(before!=after)number=val;
        int rem =1;
        do{
            rem  = number %10;
            if (rem==0)System.out.println("Zero");
            if (rem==1)System.out.println("One");
            if (rem==2)System.out.println("Two");
            if (rem==3)System.out.println("Three");
            if (rem==4)System.out.println("Four");
            if (rem==5)System.out.println("Five");
            if (rem==6)System.out.println("Six");
            if (rem==7)System.out.println("Seven");
            if (rem==8)System.out.println("Eight");
            if (rem==9)System.out.println("Nine");
            number/=10;
        }while(number>0);
    }
    public static int reverse(int number){
        int val = number;
        if (number<0)number=-number;
        int reverse = 0;
        while(number>0){
            int rem = number%10;
            reverse = reverse* 10+rem;
            number/=10;
        }
        if (val<0)return -1*reverse;
        return reverse;
    }
    public static int getDigitCount(int number){
        int count =0;
        if(number<0)return -1;
        do {
            count++;
            number/=10;
        }while(number>0);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(-10%10);
        caseExpression('f');
        printDayOfTheWeek(4);
        printDays(4);
        for (int i = 1; i <9 ; i++) {
            System.out.println("10,000 at "+i+"% interest = "+String.format("%.2f",calcInterest(10000,i)));
        }
        for (int i = 8; i >=1 ; i--) {
            System.out.println("10,000 at "+i+"% interest = "+String.format("%.2f",calcInterest(10000,i)));
        }

        int n=4;
        System.out.println( isPrime(n));
        if(isPrime(n)) System.out.println(n);
        int count =0;
        int sum=0;
        for (int i = 1; i < 10; i++){
            if (isPrime(i)) {
                System.out.print(i+", ");
                count++;
                sum+=i;
            }
             if (count >= 3)break;
        }
        System.out.println("The sum is "+sum);

        int counter =0;
        int total=0;
        for (int i = 1; i <=1000; i++) {
            if(isDivisible(i)) {
                System.out.print(i + ", ");
                counter++;
                total +=i;
            }
            if (counter>=5)break;
        }
        System.out.println();
        System.out.println("total: "+total);

        int cont1 =0;
        int sum2 =0;
        int i=0;
        while (i<1000){
            i++;
            if (isEven(i)) {
                cont1++;
                System.out.print(i + ", ");
                sum2+=i;
            }
            if (cont1>=5)break;
        }
        System.out.println("total: "+sum2+" no:"+cont1);

        System.out.println(sumDigits(1111));

        System.out.println(isPalindrome(-11));
        System.out.println(sumFirstLast(-10));
        System.out.println(getEvenDigitSum(22));
        System.out.println(hasSharedDigit(9,9));
        //System.out.println(getDigitCount(0));
       // System.out.println(reverse(0));
        numberToWords(10);
    }


}
