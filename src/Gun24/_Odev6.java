package Gun24;

import java.util.ArrayList;

public class _Odev6 {
    public static void main(String[] args) {
        ArrayList<Integer> alist1 = new ArrayList<Integer>();
        ArrayList<Integer> alist2 = new ArrayList<Integer>();

        alist1.add(3);
        alist1.add(2);
        alist1.add(5);
        alist1.add(6);
        alist2.add(5);
        alist2.add(8);
        alist2.add(9);

        ArrayList<Integer> ortak = new ArrayList<Integer>();
        for (Integer i : alist1) {
            for (Integer j : alist2) {
                if (i == j) {
                    ortak.add(i);
                }
            }
        }
        System.out.println(ortak);
    }
}
