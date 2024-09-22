public class DenganMethod {
    public static void main(String[] args) {
        int gajipokok = 4500000;
        int tunjangantransport = 300000;
        int tunjanganmakan = 280000;
        int bonus = 2000000;

        int totalpenghasilan = hitungtotalpenghasilan(gajipokok, tunjangantransport, tunjanganmakan, bonus);
        int pajak = hitungpajak(totalpenghasilan);
        int gajibersih = hitunggajibersih(totalpenghasilan, pajak);

        tampilkandetailgaji(gajipokok, tunjangantransport, tunjanganmakan, bonus, pajak, gajibersih);
    }

    public static int hitungtotalpenghasilan(int gajipokok, int tunjangantransport, int tunjanganmakan, int bonus) {
        return gajipokok + tunjangantransport + tunjanganmakan + bonus;
    }

    public static int hitungpajak(int totalpenghasilan) {
        return totalpenghasilan * 10 / 100;
    }

    public static int hitunggajibersih(int totalpenghasilan, int pajak) {
        return totalpenghasilan - pajak;
    }

    public static void tampilkandetailgaji(int gajipokok, int tunjangantransport, int tunjanganmakan, int bonus, int pajak, int gajibersih) {
        System.out.println("Gaji pokok:" + gajipokok);
        System.out.println("Tunjangan transport:" + tunjangantransport);
        System.out.println("Tunjangan makan:" + tunjanganmakan);
        System.out.println("Bonus:" + bonus);
        System.out.println("Pajak:" + pajak);
        System.out.println("Gaji bersih:" + gajibersih);
    }
}
