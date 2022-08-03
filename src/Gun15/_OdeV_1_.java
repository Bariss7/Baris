package Gun15;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class _OdeV_1_ {
    public static void main(String[] args) {
        /*// 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
        //_Not: 0 ve 100 dahildir.
        Scanner oku=new Scanner(System.in);
        int i=0;
        while (i<=100)
        {
            for (int j = 0; i <= 100; i++)
             if (i%2==0)
                 System.out.println("i = " + i);}*/
        //0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
        //Sonuç bu şekilde olmalıdır.
        Scanner oku=new Scanner(System.in);
        int i=0;
        while (i<=100)
        {
            for (int j = 0; i <= 100; i++)
                if (i%4==0&&i%5==0 )
                    System.out.println("i = " + i);}







    }
}
