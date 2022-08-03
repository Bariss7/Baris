package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Sets -> hashset,linkedhashset,treeset
        // Maps -> hashmap,linkedhashmap,treemap

        Map<Integer,Integer> m=new HashMap<>();// map ailesinden hashmap key ı ve valuesi si INTEGER olan bir map
        m.put(2,11); // 2 key ine 11 atandı
        m.put(3,12);
        m.put(7,17);
        m.put(2,5); // 2 anahrtarındaki degeri güncelledi
        System.out.println("m = " + m);//m = {2=5, 3=12, 7=17} key value
        System.out.println("m.get(2) = " + m.get(2));// 2 anahtarındaki deger //5
        System.out.println("m.keySet() = " + m.keySet());//m.keySet() = [2, 3, 7]
        System.out.println("m.values() = " + m.values());//m.values() = [5, 12, 17]

        for (Integer k :m.keySet())
            System.out.println("k = " + k);

        for (Integer v :m.values())
            System.out.println("v = " + v);

        for (Map.Entry<Integer,Integer>anahtarValue:m.entrySet())
        {
            System.out.println("anahtarValue.getKey() = " + anahtarValue.getKey());
            System.out.println("anahtarValue.getValue() = " + anahtarValue.getValue());
        }

        System.out.println("m.containsKey(2) = " + m.containsKey(2));//true
        System.out.println("m.containsValue(12) = " + m.containsValue(12));//true

        m.remove(2);//2 siliyor
        System.out.println("m = " + m);

        System.out.println("m.keySet().size() = " + m.keySet().size());

        m.clear();
        System.out.println("m = " + m);





    }
}
