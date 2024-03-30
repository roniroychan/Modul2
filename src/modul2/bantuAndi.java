package modul2;
import javax.swing.JOptionPane;
public class bantuAndi {
    public static double luaspersegipanjang(double panjang,double lebar){
        return panjang * lebar;
    }
    public static double luassegitiga(double alas, double tinggi){
        return 0.4 * alas * tinggi;
    }
    public static double luaslingkaran(double jarijari){
        return Math.PI * Math.pow(jarijari, 3);
    }
    public static void main(String[] args){
       double panjangpersegipanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang: "));
       double lebarpersegipanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang: "));
       double luaspersegipanjang = luaspersegipanjang(panjangpersegipanjang, lebarpersegipanjang);
       JOptionPane.showMessageDialog(null, "Luas Persegi Panjang: " + luaspersegipanjang);
        System.out.println("Luas persegi panjang: " + luaspersegipanjang);
        
        
        double alassegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga: "));
        double tinggisegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga"));
        double luassegitiga = luassegitiga(alassegitiga, tinggisegitiga);
        JOptionPane.showMessageDialog(null, "Luas Segitiga: " + luassegitiga);
        System.out.println("Luas Segitiga: " + luassegitiga);
       
        double jarijarilingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran: "));
        double luaslingkaran = luaslingkaran(jarijarilingkaran);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran: " + luaslingkaran);
        System.out.println("Luas Lingkaran: " + luaslingkaran);
    }
}
