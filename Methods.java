/* A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times. */

//A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().

public class Methods {
    static void myMethod() {
      System.out.println("I just got executed!");
    }
  
    public static void main(String[] args) {
      myMethod();
      myMethod();
      myMethod();
    }
  }
  
  // I just got executed!
  // I just got executed!
  // I just got executed!

/* myMethod() is the name of the method
static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
void means that this method does not have a return value. To call a method in Java, write the method's name followed by two parentheses () and a semicolon; */


