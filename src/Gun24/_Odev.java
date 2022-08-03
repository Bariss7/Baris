package Gun24;

import java.util.ArrayList;

public class _Odev {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Orange");
        arr.add("Kiwi");
        arr.add("Peach");
        arr.add("Banana");
        arr.add("Orange");

        System.out.println(getCount(arr, "Orange"));
    }

    public static int getCount(ArrayList<String> arr, String input) {
        int count = 0;

        for (String i : arr) {
            if (i.equals(input)) {
                count++;
            }
        }
        return count;

    }
}
