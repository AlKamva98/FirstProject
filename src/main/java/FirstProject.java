 //import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

 import java.util.Scanner;
public class FirstProject {

    static Scanner con = new  Scanner(System.in);

    public static void main(String [] args){
        int ans;
        int num1, num2;


        System.out.print("Enter the first number:");
        num1 = Integer.parseInt(con.next());

        System.out.print("Enter the second number:");
        num2 = Integer.parseInt(con.next());

        ans = num1+ num2;
        System.out.println("The answer is: "+ ans);

    }
}
