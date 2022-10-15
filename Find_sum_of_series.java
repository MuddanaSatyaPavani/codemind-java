import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double sum=0.0;
        for(int i=1; i<=n; i++)
        {
            sum = sum + (1 / (double)i);
        }
        
        System.out.printf("%.2f",sum);
    }
}