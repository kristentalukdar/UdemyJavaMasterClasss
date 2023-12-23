package Classes;

public class ControlFlow {
    //Switch Statement Examples
    public static void traditionalNumCheck(int val){
        switch(val) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3,4,5:
                System.out.println("Number is either 3 or 4 or 5");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Number is either 6 or 7 or 8");
                break;
            default:
                System.out.println("Value is neither 1 or 2");
                break;
        }
    }

    public static void enhancedNumCheck(int val){
        switch (val) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> System.out.println("Number is either 3 or 4 or 5");
            case 6, 7, 8 -> System.out.println("Number is either 6 or 7 or 8");
            default -> System.out.println("Value is neither 1 or 2");
        }
    }

    public static String getQuarterOfMonth(String month){
        switch(month){
            case "January":
            case "February":
            case "March":
            case "April":
                return "First Quarter";
            case "May", "June", "July", "August":
                return "Second Quarter";
            case "September", "October", "November", "December":
                return "Third Quarter";
        }
        return "Not Available";
    }

    public static void traditionalNato(char alpha){
        switch(alpha){
            case 'A':
                System.out.println("A: Able");
                break;
            case 'B':
                System.out.println("B:Baker");
                break;
            case 'C':
                System.out.println("C: Charlie");
                break;
            case 'D':
                System.out.println("D: Dog");
                break;
            case 'E':
                System.out.println("E: Easy");
                break;
            default:
                System.out.println("Not found");
        }

    }

    public static void enhancedNato(char alpha){
        switch (alpha) {
            case 'A' -> System.out.println("A: Able");
            case 'B' -> System.out.println("B:Baker");
            case 'C' -> System.out.println("C: Charlie");
            case 'D' -> System.out.println("D: Dog");
            case 'E' -> System.out.println("E: Easy");
            default -> System.out.println("Not found");
        }

    }


    public static double calculateInterest(double amount, double interest){
        return (amount * (interest/100));
    }

    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
                //System.out.println(num +" is not a prime number.");
                return false;
            }

        }
        //System.out.println(num +" is a prime number");
        return true;
    }

    public static void primeCount(int num) {
        int count = 0;
        for (int i = 2; ((count < 3) && (i < num)); i++) {
            if (isPrime(i)) {
                System.out.println("The prime number is: " + i);
                count++;
                /*
                if(count==3){
                    System.out.println("The counter variable is 3. END");
                    break;
                }
                */
            }
        }
    }

    public static void sumThreeAndFive(int num) {
        int sum = 0;
        int count = 0;
        for (int i = 1; ((count < 5) && (i < num)); i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("The number divisible by both 3 and 5 is: " + i);
                sum += i;
                count++;
            }
        }
        innerMethod();
        System.out.println("The sum is: " + sum);
    }

    public static void innerMethod(){
        int x=10;
        System.out.println(x);
    }

    public static boolean isOdd(int num){
        if(num<0){
            return false;
        }
        if(!(num%2==0)){
            return true;
        }
        else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        if ((start > 0) && (end > 0) && (end >= start)) {
            for (int i = start; i < end + 1; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        else {
            return -1;
        }
    }


   public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
   }

   public static void whileTest(){
        int i=5;
        int evenCount=0;
        int oddCount=0;
        while((i<21) && (evenCount<5)){
            i++;
            if(isEven(i) ){
                System.out.println("The even number is: " + i);
                evenCount++;
                continue;
            }
            oddCount++;
        }
       System.out.println("The total number of even are:"+ evenCount);
       System.out.println("The total number of odd are:"+ oddCount);
   }
   public  static int sumDigits(final int num){
        if(num<0){
            return -1;
        }
        int myNum=num;
        int rem;
        int sum = 0;
       while (myNum > 0) {
           rem = myNum % 10;
           myNum = myNum / 10;
           sum += rem;
       }
       System.out.println("the sum is: " + sum);
       return sum;
   }

    public static void isPalindrome(int number){
        int revNum=0;
        int newNum=number;
        boolean palindrome=false;
        int rem;
        while(newNum>0){
            rem=newNum%10;
            revNum=rem*10;
            newNum=newNum/10;

        }

    }




    public static void main(String[] args) {
        /*

        traditionalNumCheck(1);
        traditionalNumCheck(8);
        enhancedNumCheck(5);
        System.out.println(getQuarterOfMonth("October"));

        traditionalNato('A');
        traditionalNato('G');

        for (double rate=2.0; rate<5.0; rate=rate +0.5){
            double t= calculateInterest(10000, rate);
            System.out.println("The Interest Rate for amount 10000  at rate " + rate+ " is: " + t );
        }

        for (double rate=7.5; rate<10; rate=rate +0.25){
            double t= calculateInterest(10000, rate);
            if(rate>8.75){
                break;
            }
            System.out.println("The Interest Rate for amount 10000  at rate " + rate+ " is: " + t );
        }


        isPrime(11);
        isPrime(6);
        primeCount(9);
        primeCount(11);
        primeCount(47);

        sumThreeAndFive(10000000);

         */

//        whileTest();
        sumDigits(1);



    }
}
