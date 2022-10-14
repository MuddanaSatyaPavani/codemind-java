import java.util.*;
import java.lang.*;
class V
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d,s,ar,area;
        d=a+b+c;
        s=d/2;
        ar=(s*(s-a)*(s-b)*(s-c));
        area=Math.sqrt(ar);
        System.out.printf("%.2f",area);
    }
}