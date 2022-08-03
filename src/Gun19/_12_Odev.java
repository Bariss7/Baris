package Gun19;

import java.util.Scanner;

public class _12_Odev {
    public static void main(String[] args) {
        //Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
        //number:6
        //factorial:1*2*3*4*5*6=720
        //output ---> 720
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayı= oku.nextInt();
        int çarpım=1;

        for (int i=1;i<=sayı;i++){
            çarpım=çarpım*i;
        }
        System.out.println("çarpım = " + çarpım);

        }
    }

