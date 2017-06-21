import java.util.*;

public class numdigit {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
             double a = sc.nextDouble();
            for(int n=0;n<200000;n++)
            {
             double b=Math.pow(10, n);

             double d=a/b;
            if(d>=0 & d<=9)
            {
                System.out.println("The number has "+(n+1)+" DIGITS");
                break;
            }
            }

    }

}
