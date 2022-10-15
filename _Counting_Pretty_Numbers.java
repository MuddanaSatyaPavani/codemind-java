import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<=t;i++)
        {
            int l=sc.nextInt();
		    int r=sc.nextInt();
		    int count=0;
		    for(int j=l;j<=r;j++)
		    {
		        int rem=j%10;
		        if(rem ==2 || rem==3 || rem==9)
		        {
		            count++;
		        }
		    }
		    System.out.println(count+"");
        }
    }
}