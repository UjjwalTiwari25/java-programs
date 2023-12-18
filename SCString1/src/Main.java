import org.w3c.dom.ls.LSOutput;

import java.io.StringBufferInputStream;

public class Main {
    public static void main(String[] args)
//    { int b= 1001010;
//        String str=String.valueOf(b);
//        System.out.println(str.matches("[01]+"));u
    {String str="12345677AL";
        System.out.println(str.matches("[0-9A-F]+"));
    }
}