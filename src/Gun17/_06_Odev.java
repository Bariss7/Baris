package Gun17;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Odev {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
                // Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
                //Eğer aitse "true" çevirin.
        Scanner oku=new Scanner(System.in);
        String[] dizi={"apple,orange,banana,pineapple"};
        boolean deger;
        int index= Arrays.binarySearch(dizi,"apple");
        if (index>=0) {
            deger = true;
            System.out.println(deger);
        }





            }

        }
















