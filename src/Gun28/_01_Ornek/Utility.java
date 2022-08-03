package Gun28._01_Ornek;

public class Utility {

    //2.yöntem , nesneye ait metodlar
    public String getString(int sayi){
        return String.valueOf(sayi);
    }
    public int getInt(String strRakam){
        return Integer.parseInt(strRakam);
    }

    //3.yöntem : class a ait
    public static String getString2(int sayi){
        return String.valueOf(sayi);
    }
    public static int getInt2(String strRakam){
        return Integer.parseInt(strRakam);
    }
}
