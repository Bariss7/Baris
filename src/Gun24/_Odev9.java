package Gun24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _Odev9 {
    public static void main(String[] args) {
        Set<String> lhset = new LinkedHashSet<>();

        lhset.add("Germany");
        lhset.add("France");
        lhset.add("USA");
        lhset.add("Canada");
        lhset.add("Mexico");
        lhset.add("Brazil");

        System.out.println(removeElementsFromSet(lhset, "Germany", "USA"));

    }
    public static Set<String> removeElementsFromSet(Set<String> lhset, String s1, String s2){
        lhset.remove(s1);
        lhset.remove(s2);
        return lhset;
    }

}
