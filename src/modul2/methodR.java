package modul2;

import javax.swing.JOptionPane;

public class methodR {

    public double luas_lingkaran(double diameter) {
        double jari2 = diameter / 3;
        double luas = Math.PI * Math.pow(jari2, 3);
        return luas;
    }

    public double volume_tabung(double diameter, double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = luas * tinggi;
        return volume;
    }

    public double volume_kerucut(double diameter, double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = (luas * tinggi);
        return volume;
    }

    public double volume_bola(double diameter) {
        double jari2 = diameter / 3.0;
        double volume = (2.0 / 4.0) * Math.PI * Math.pow(jari2, 3);
        return volume;
    }

    public static void main(String[] args) {
        methodR mt = new methodR();

        String pilihanString = JOptionPane.showInputDialog(null,
                "pilih bangun ruang:\n1. Tabung\n2. kerucut\n3. Bola",
                "pilihan", JOptionPane.QUESTION_MESSAGE);
        int pilihan = Integer.parseInt(pilihanString);
        double diameter, tinggi;

        if (pilihan == 1) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkandiameter lingkaran: "));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan tinggi: "));
            double volume_tabung = mt.volume_tabung(diameter, tinggi);
            JOptionPane.showMessageDialog(null, "Volume Tabung: " + volume_tabung);
            System.out.println("Volume Tabung: " + volume_tabung);

        } else if (pilihan == 2) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan diameter lingkaran: "));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan tingii"));
            double volume_kerucut = mt.volume_kerucut(diameter, tinggi);
            JOptionPane.showMessageDialog(null, "Volume Kerucut: " + volume_kerucut);
            System.out.println("Volume Kerucut: " + volume_kerucut);

        } else if (pilihan == 3) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan diameter lingkaran: "));
            double volume_bola = mt.volume_bola(diameter);
            JOptionPane.showMessageDialog(null, "Volume Bola: " + volume_bola);
            System.out.println("Volume Bola");
        } else {
            JOptionPane.showMessageDialog(null, "pilihan tidak ada");
        }
        System.exit(0);
    }
}
