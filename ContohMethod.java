public class ContohMethod {
    public static int hitungluaspersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    public static void main(String[] args) {
        int sisi = 5;
        int luas = hitungluaspersegi(sisi);
        System.out.println("Luas persegi dengan sisi" + sisi + " adalah" + luas);
    }
}
