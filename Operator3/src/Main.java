import java.lang.*;
import java.util.Scanner;
class Operator3

{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,h;
        double Vol,SA,Wall;
        System.out.println("Enter the value of l,b,h");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        Vol=(l*b*h);
        SA=2*((l*b)+(l*h)+(b*h));
        Wall=2*((l*h)+(b*h));
        System.out.println("Volume is: "+Vol);
        System.out.println("Surface Area is :"+SA);
        System.out.println("Wall Area is :"+Wall);
    }
}