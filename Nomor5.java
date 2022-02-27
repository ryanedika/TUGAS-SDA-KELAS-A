import java.util.ArrayList;

public class Nomor5 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("d");
        nama.add("i");
        nama.add("k");
        nama.add("a");
        
        System.out.println("Sebelum di-Remove");
        for(String x : nama){
            System.out.println(x);
        }

        nama.remove(0);
        nama.remove(3);
        nama.remove(2);
        
        System.out.println("Setelah di-Remove");
        for(String z : nama){
            System.out.println(z);
        }
    
}
    
}
