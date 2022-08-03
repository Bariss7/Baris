package Gun42.StringIslemler;

public class _01_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="bugün hava çok güzel";
        String cumle2="bugün hava çok güzel";
        String cumle3=new String("bugün hava çok güzel");
        String cumle4=new String("bugün hava çok güzel");

        if (cumle1 == cumle2)
            System.out.println("cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit değil");

        if (cumle1.equals(cumle2))
            System.out.println("cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit değil");

        //*********** nesneler için sonuçlar ***********//
        if (cumle3 == cumle4)
            System.out.println("cümle 3 cümle 4 ye eşit");
        else
            System.out.println("cümle 3 cümle 4 ye eşit değil");

        if (cumle3.equals(cumle4))
            System.out.println("cümle 3 cümle 4 ye eşit");
        else
            System.out.println("cümle 3 cümle 4 ye eşit değil");


    }
}
