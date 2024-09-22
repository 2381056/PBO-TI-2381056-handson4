public class ContohMethodStaticdanNonstatic {
    public static double hitungluasPersegi(double sisi){
        return sisi * sisi;
    }
    public static void tampilkanPesanSelamatDatang(String nama){
        System.out.println("Selamat datang." + nama + "!");
    }
    public static void main(String[] args){
        double luasPersegi = ContohMethodStaticdanNonstatic.hitungluasPersegi(5);
        System.out.println("Luas persegi dengan sisi 5:" + luasPersegi);
        ContohMethodStaticdanNonstatic objek = new ContohMethodStaticdanNonstatic();
        objek.tampilkanPesanSelamatDatang("John");
        objek.hitungluasPersegi(5);
    }
}
