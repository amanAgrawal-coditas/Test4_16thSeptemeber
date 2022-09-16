package Test4_16thSeptember.ExceptionHandling;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args)
    {
        int sum = 0,counter=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String name=sc.nextLine();
       char[]ch=name.toCharArray();
        for(int i=0;i<ch.length;i++)
        {

            if(!Character.isDigit(ch[i])){
                counter++;
            }
            else{
                int j=Integer.parseInt(String.valueOf(ch[i]));
                sum=sum+j;
            }

//            if(name.charAt(i) >= 0 || name.charAt(i) <= 9)
//            {   int j=Integer.parseInt(String.valueOf(name.charAt(i)));
//                sum = sum + j;
//            }
        }
        System.out.println(sum);
        if(sum==0)
        {
            try {
                throw new NumberNotFound("No number is present");
            } catch (NumberNotFound numberNotFound) {
                numberNotFound.printStackTrace();
                System.out.println("Number not found");
            }
        }
        else
        {
            System.out.println("it has numbers");
        }

        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number>sum)
        {
            try{
                throw new NumberOutOfRange();
            }
            catch (NumberOutOfRange numberOutOfRange)
            {
                numberOutOfRange.printStackTrace();
            }
        }
        else
        {
            System.out.println("The sum is greater than number");
        }
        System.out.println("the number is "+number);
        System.out.println("The sum is "+sum);
    }
}
