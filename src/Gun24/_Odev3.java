package Gun24;

import java.util.ArrayList;

public class _Odev3 {
    public static ArrayList<String> changelnArraylist (ArrayList <String> arr, String s1, String s2){

        for(int i=0;i<arr.size();i++){
            if(arr.get(i).contains(s1)){
                arr.set(i, s2);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("yellow");
        arr.add("red");
        arr.add("blue");
        arr.add("red");
        arr.add("blue");
        System.out.println(changelnArraylist(arr, "blue", "yellow"));
    }
}
