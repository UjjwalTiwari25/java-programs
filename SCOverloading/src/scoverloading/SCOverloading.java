/*
package scoverloading;
public class SCOverloading
{
    static byte max(byte x,byte y)
    {
        return x>y?x:y;
    }
    static float max(float x,float y)
    {
        if(x>y)
            return x;
        else
            return y;
    }


    public static void main(String[] args) {
        System.out.println(max(3,6));
    }
}*/
/*package scoverloading;
public class SCOverloading
{
    static double area(double r)
    {
        return Math.PI*r*r;
    }
    static double area(double l,double b)
    {
        return l*b;
    }

    public static void main(String[] args)
    {
        System.out.println(area(5.5,2.3));
    }
}
    */
package scoverloading;
public class SCOverloading
{
    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String[] args) {
        System.out.println(validate(18));
    }
}
