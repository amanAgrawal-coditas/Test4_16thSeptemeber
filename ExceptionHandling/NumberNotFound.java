package Test4_16thSeptember.ExceptionHandling;

public class NumberNotFound extends Exception
 {
    NumberNotFound()
    {
        System.out.println("There is no number in the String");
    }
    NumberNotFound(String Message)
    {
        System.out.println(Message+" Hence not possible");
    }
 }
