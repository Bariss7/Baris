package Gun09;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1; //sayacın değerini 1 artırır sayac=1
        sayac++; // sayacın değerini 1 artırır sayac=2
        ++sayac; // sayacın deeğerini 1 artırır sayac=3

        sayac=sayac-1; // sayacın deeğerini 1 azaltır sayac=2
        sayac--; // sayacın değerini 1 azaltır sayac=1
        --sayac; // sayacın değerini 1 azaltır sayac=0

        int sonuc=0;
        sonuc = sayac++; // önce işlem yapılır sonra sayacın değeri 1 artırılır
                         // bu duruma göre  sonuc=sayac; sayac=sayac+1;
                         // sonuc=0 sayac=1

        sonuc=0;
        sonuc=++sayac;   // önce artırma işllemi yapılır sonra diğer işlme geçilir
                         // sayac=sayac+1; sonuc=sayac;
                         // sayac=1, sonuc=1




    }
}
