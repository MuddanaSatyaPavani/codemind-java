import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        float c,f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
        f=((c*9)/5)+32;
        System.out.printf("%.2f",f);
    }
}