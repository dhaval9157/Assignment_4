
class NegativeDiameterException extends Exception{ public String toString() {
    return "Diameter cannot be negative!";
}
    public String getMessage() {
        return "Diameter cannot be negative!";
    }
}

public class pr_2 {

    public static double area(int r) throws NegativeDiameterException{ if (r<0){
        throw new NegativeDiameterException();
    }
        double result = Math.PI*r*r; return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{ int result = a/b;
        return result;
    }


    public static void main(String[] args) {

        try{
            int c = divide(6, 0);
            System.out.println(c);
            double ar = area(-6);
            System.out.println(ar);
        }
        catch(Exception e){ System.out.println("Exception");
            System.out.println("Diameter cannot be negative ");
        }
        //Prepared by Dhaval_21CE089
    }
}
