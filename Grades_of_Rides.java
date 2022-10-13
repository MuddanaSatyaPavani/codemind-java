import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int hurl,spin,speed;
        Scanner sc=new Scanner(System.in);
        hurl=sc.nextInt();
        spin=sc.nextInt();
        speed=sc.nextInt();
        if (hurl>50 && spin>60 && speed>100)
        {
            System.out.print("10");
        }
         else if (hurl>50 && spin>60)
        {
            System.out.print("9");
        }
        else if ( spin>60 && speed>100)
        {
            System.out.print("8");
        }
        else if (hurl>50 && speed>100)
        {
            System.out.print("7");
        }
        else if (hurl>50 || spin>60 || speed>100)
        {
            System.out.print("6");
        }
        else
        {
            System.out.print("5");
        }
       
    }
}