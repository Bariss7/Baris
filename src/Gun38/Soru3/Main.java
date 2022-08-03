package Gun38.Soru3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<ReadFile>list=new ArrayList<>();
        TxtFile txt=new TxtFile();
        PowerPointFile ppt=new PowerPointFile();
        DMGFile dmg=new DMGFile();
        EXEFile exe=new EXEFile();

        Collections.addAll(list,txt,ppt,dmg,exe);
        for (ReadFile file:list){
            System.out.println("******"+file.getClass().getSimpleName()+"*******");
            if (file instanceof TxtFile){
                System.out.println(file.open());
                System.out.println(file.read());
                System.out.println(file.save());
                System.out.println(file.close());}
            if (file instanceof PowerPointFile){
                System.out.println(file.open());
                System.out.println(file.read());
                System.out.println(file.save());
                System.out.println(file.close());}
            if (file instanceof DMGFile){
                System.out.println(file.open());
                System.out.println(file.read());
                System.out.println(file.save());
                System.out.println(file.close());}
            if (file instanceof EXEFile){
                System.out.println(file.open());
                System.out.println(file.read());
                System.out.println(file.save());
                System.out.println(file.close());}

        }
    }
}
