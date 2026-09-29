import java.util.Scanner;
class exception_handling
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    try
    {
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
                 c=a/b;
       System.out.println(c);
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    try
    {
        int arr[]={10,20,30};
        System.out.println(arr[3]);
    }catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }try
    {
    String s=null;
    System.out.println(s.length());

    }catch(NullPointerException e)
    {
        System.out.println(e);
    }
    finally{
        System.out.println("this is finally block always excuted wethere the exception is occur or not");
    }
    }}