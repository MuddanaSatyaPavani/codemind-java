import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.print(sum);
    }
}