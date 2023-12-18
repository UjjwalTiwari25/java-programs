package methodpractice;
public class MethodPractice
 {
  static int max(byte x,byte y)
  {
      return x>y?x:y;
  }
  static float max(float x,float y)
  {
     if (x>y)
         return x;
     else
         return y;
  }
     public static void main(String[] args)
     {
         {
          System.out.println(max(10,5));
         }
     }
 }