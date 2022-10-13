import java.util.*;
import java.lang.*;
class Sample
{
    public static void main(String args[])
    {
         double a,b,c,s,area,x;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
         b=sc.nextDouble();
        c=sc.nextDouble();
         s=(a+b+c)/2;
        area=(s*(s-a)*(s-b)*(s-c));
        x=Math.pow(area,0.5);
        System.out.printf("%.2f",x);
    }
}
