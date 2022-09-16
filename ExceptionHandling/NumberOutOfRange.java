package Test4_16thSeptember.ExceptionHandling;

public class NumberOutOfRange extends Exception
 {
    NumberOutOfRange()
    {
        System.out.println("The number is less than user");
    }
    NumberOutOfRange(String Message)
        {
            System.out.println(Message);
        }

 }
