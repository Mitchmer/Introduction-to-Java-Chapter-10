//Design a class named MyInteger. The class contains:

//An int data field named value that stores the int value represented by this object.

//A constructor that creates a MyInteger object for the specified int value.

//A getter method that returns the int value.

//The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.

//The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.

//The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) 
//that return true if the specified value is even, odd, or prime, respectively.

//The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.

//A static method parseInt(char[]) that converts an array of numeric characters to an int value.

//A static method parseInt(String) that converts a string into an int value.

import java.util.Scanner;

public class Project2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    MyInteger n1 = new MyInteger(input.nextInt());
    System.out.println("n1 is even? " + n1.isEven());
    System.out.println("n1 is prime? " + n1.isPrime());
    System.out.println("15 is prime? " + MyInteger.isPrime(15));

    char[] chars = {'3', '5', '3', '9'};
    System.out.println(MyInteger.parseInt(chars));

    System.out.print("Enter a string: ");
    String s = input.next();
    System.out.println(MyInteger.parseInt(s));
    
    System.out.print("Enter an integer: ");
    MyInteger n2 = new MyInteger(input.nextInt());
    System.out.println("n2 is odd? " + n2.isOdd());
    System.out.println("45 is odd? " + MyInteger.isOdd(45));
    System.out.println("n1 is equal to n2? " + n1.equals(n2));
    System.out.println("n1 is equal to 5? " + n1.equals(5));
  }
}

class MyInteger {
    int value;

    MyInteger(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }

    boolean isEven() {
        return this.value % 2 == 0;
    }
    boolean isOdd() {
        return this.value % 2 != 0;
    }
    boolean isPrime() {
        if (this.value <= 1) {
            return false;
        }

        if (this.value == 2) {
            return true;
        }

        if (this.value % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= this.value; i += 2) {
            if (this.value % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isEven(int value) {
        return value % 2 == 0;
    } 
    static boolean isOdd(int value) {
        return value % 2 != 0;
    }
    static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }

        if (value == 2) {
            return true;
        }

        if (value % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isEven(MyInteger integer) {
        return integer.getValue() % 2 == 0;
    } 
    static boolean isOdd(MyInteger integer) {
        return integer.getValue() % 2 != 0;
    } 
    static boolean isPrime(MyInteger integer) {
        int value = integer.getValue();
        if (value <= 1) {
            return false;
        }

        if (value == 2) {
            return true;
        }

        if (value % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean equals(int value) {
        return this.value == value;
    }
    boolean equals(MyInteger integer) {
        return this.value == integer.getValue();
    }

    static int parseInt(char[] charArr) {
        return Integer.parseInt(String.valueOf(charArr));
    }
    static int parseInt(String str) {
        return Integer.parseInt(str);
    }

}