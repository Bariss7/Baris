package Gun24;

import java.util.ArrayList;

public class _Odev1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(getSum(list));

    }

    public static int getSum(ArrayList<Integer> list){

        int sum = 0;

        for (Integer sayac : list) {

            sum += sayac;

        }

        return sum;

    }
}
