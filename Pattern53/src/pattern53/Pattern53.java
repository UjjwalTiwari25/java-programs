/*
package pattern53;
public class Pattern53
{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i<=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
            System.out.println(" ");

        }

 /*
 */
/*package pattern53;
public class Pattern53
{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
                if(i+j>5)
                {
                    System.out.println("*");
                }
        }
        {
            for(int j=2;j<=5;j++)
            {
                System.out.println(("*"));
            }
            System.out.print(" ");
        }
    }
}*/
 package pattern53;
 public class Pattern53
 {
     public static void main(String[] args)
     {
         for(int i=1;i<=5;i++)
         {
             for(int j=1;j<=(5-i);j++)
             {

                 System.out.print(" ");
             }
             for(int j=1;j<=((i-1)*2)+1;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
 }
/*
 {
     public static void main(String[] args)
     {
         for(int i=1;i<=5;i++)
         {
             for(int j=1;j<=(5-i);j++)
             {
                 System.out.print(" ");
             }
             for (int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             for (int j=(i-1);j>0;j--)
             {
                 System.out.print("*");
             }
             System.out.println();
         }

     }
 }*/
