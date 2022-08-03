package Gun24;

import java.util.ArrayList;

public class _Odev2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("New Jersey");
        list.add("New york");
        list.add("Ohio");
        list.add("Florida");
        list.add("Boston");

        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            arrayList.add(list.get(i).length());
        }
        System.out.println(arrayList);

    }
}
