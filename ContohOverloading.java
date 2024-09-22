import java.security.cert.TrustAnchor;

public class ContohOverloading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungLuas(double jarijari, boolean isilingkaran) {
        if (isilingkaran) {
            return Math.PI * jarijari * jarijari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luaspersegi = hitungLuas(5);
        System.out.println("Luas persegi:" + luaspersegi);

        double luaspersegipanjang = hitungLuas(6);
        System.out.println("Luas persegi panjang:" + luaspersegipanjang);

        double luaslingkaran = hitungLuas(3, true);
        System.out.println("Luas lingkaran:" + luaslingkaran);
    }
}
