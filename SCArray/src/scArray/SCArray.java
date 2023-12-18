package scArray;

import java.util.Arrays;
import java.util.Scanner;

public class SCArray {
    public static void main(String[] args)

        /*sum of all element in an Array*/
      /*  int A[]={3,5,4,9,7,3,5};
                int sum=0;
        for(int x:A)
        {
            sum=sum+x;
        }
        System.out.println("sum is  "+sum);

    }
}*/
    //Searching an Element in an Array//
   /* {
        Scanner sc = new Scanner(System.in);
        int A[] = {4, 5, 3, 8, 9, 1,7};
        int Key;
        System.out.println("Enter a Key ");
        Key = sc.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (Key == A[i]) {
                System.out.println(" Key Element found at  " + i);
                System.exit(0);
            }
        }
        System.out.println("Key not found");
    }
}*/
//Deleting an element form given array\\
    {
        int A[]=new int[10];
        A[0]=4;
        A[1]=7;
        A[2]=3;
        A[3]=8;
        A[4]=9;
        A[5]=0;
        int n=6;

        for (int i = 0; i < n; i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println(" ");
        int index =3;
        for (int i = index; i<A.length-1; i++)
        {
          A[i-1]=A[i];
        }
        System.out.println("Array after deleting : "+ Arrays.toString(A));
    }


}