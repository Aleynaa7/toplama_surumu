import java.util.Scanner;

public class hesap_makinesi {

    public static void topla(int x, int y){
        System.out.println(x+y);
    }


    public static void bolme(int x, int y){
    
        try{
            double result = x/y;
            System.out.println(result);
    }   catch(Exception e){
    
        System.out.println("sonsuz");
    
    }
    }

}