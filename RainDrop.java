import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if (n%3==0 && n%5!=0 && n%7!=0)
        {
            System.out.print("Pling");
        }
        else if (n%3!=0 && n%5==0 && n%7!=0)
        {
            System.out.print("Plang");
        }
        else if (n%3!=0 && n%5!=0 && n%7==0)
        {
            System.out.print("Plong");
        }
       else if (n%3==0 && n%5==0 && n%7!=0)
        {
            System.out.print("PlingPlang");
        }
        else if (n%3==0 && n%7==0 && n%5!=0)
        {
            System.out.print("PlingPlong");
        }
         else if (n%5==0 && n%7==0 && n%3!=0 )
        {
            System.out.print("PlangPlong");
        }
          else
        {
            System.out.print(n);
        }
    }
}