package Gun24;

import java.util.ArrayList;

public class _Odev7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);

        System.out.println(secondMax(arr));
    }
    public static int secondMax(ArrayList<Integer> arr){

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>max){
                max=arr.get(i);

            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)<max && arr.get(i)>secondMax){
                secondMax=arr.get(i);
            }
        }
        return secondMax;

    }
}
