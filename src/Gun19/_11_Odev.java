package Gun19;

import java.util.Scanner;

public class _11_Odev {
    public static void main(String[] args) {
        //Aşağıda verilen gün adlarına göre, Girilen bir gün numarasına karşılık gelen gün adını yazınız
        Scanner oku=new Scanner(System.in);
        System.out.print("gün numarasaı giriniz=");
        int günNumarası= oku.nextInt();
        switch (günNumarası){
            case 1: System.out.println("monday");break;
            case 2: System.out.println("tuesday");break;
            case 3: System.out.println("wednesday");break;
            case 4: System.out.println("thursday");break;
            case 5: System.out.println("friday");break;
            case 6: System.out.println("saturday");break;
            case 7: System.out.println("sunday");break;
            default: System.out.println("this is not a valid day");
        }
    }
}
