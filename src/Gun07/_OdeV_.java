package Gun07;

import java.util.Scanner;

public class _OdeV_ {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        String text="paper";
        System.out.println("orjinal hali=" + text );
        System.out.println("text in büyük hali="+ text.toUpperCase());

        String text2="OraNge";
        System.out.println("orjinal hali="+ text2);
        System.out.println("text in küçük hali=" + text2.toLowerCase());

        String text3="New Jersey";
        System.out.println("orjinal hali=" + text3);
        System.out.println("text in büyük hali=" + text3.toUpperCase());

        String text4="New York";
        System.out.println("orjinal hali=" + text4);
        System.out.println("text in küçük hali=" + text4.toLowerCase());

        String text5="PADDLE";
        System.out.println("orjinal hali=" + text5);
        System.out.println("text in küçük hali=" + text5.toLowerCase());

        String kelime="apple";
        boolean varMı=kelime.contains("app");
        System.out.println("varMı = " + varMı);
    }
}
