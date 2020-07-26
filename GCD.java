import java.util.*; 
class GCD
{
 public static void main(String args[])
 {
   Scanner obj=new Scanner(System.in);
   int res,a,b;
   System.out.println("Enter A:");
   a=obj.nextInt();
   System.out.println("Enter B:");
   b=obj.nextInt();
   res=gcdcal(a,b);
   System.out.println("GCD of A and B is "+res); 
 }

 public static int gcdcal(int x,int y)
 {
   while(x!=y)
   {
     if(x>y)
        return gcdcal(x-y,y);
     else
        return gcdcal(x,y-x);
   }
   return x;
 }
 
}