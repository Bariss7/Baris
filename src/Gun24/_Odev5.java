package Gun24;

import java.util.ArrayList;

public class _Odev5 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        liste.add(5);
        liste.add(4);
        liste.add(6);
        liste.add(2);
        liste.add(1);

        System.out.println(middleNum(liste));
    }
    public static int middleNum(ArrayList<Integer> a){
        int sonuc = 0;

        for (int i = 1; i < a.size()-1; i++) {

            if(a.get(i) < a.get(i-1) && a.get(i) > a.get(i+1)){
                sonuc = a.get(i);
            }
        }
        return sonuc;

    }
}
