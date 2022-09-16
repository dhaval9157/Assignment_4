import java.util.*;
public class pr_3
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Enter the two num:");
            Scanner sc=new Scanner(System.in);
            int no1=sc.nextInt();
            int no2=sc.nextInt();
            System.out.println("no1:"+no1+" no2:"+no2);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error Name :" +e);
        }

        try
        {
            String a="dhaval";
            int b=a.charAt(19);
            System.out.println("b:"+b);



        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("\n\nError Name :"+e);
        }
        finally
        {
            System.out.println("\n\nExecuting the finally block");
            //prepared by Dhaval_21CE089
        }
    }

}
