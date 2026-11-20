public class Deposito extends Rekening implements BerBunga{

    private double bungaPersen;

    public Deposito (String nomor, String pemilik, int saldo, double bungaPersen) {
        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }

    @Override
    public int biayaAdminBulanan() {
        return 0;
    }

    @Override
    public int tambahBunga() {
        int bunga = (int) (saldo * bungaPersen / 100);

        setor(bunga);

        return bunga;
    }

    @Override
    public String keterangan() {
        return "Deposito, bunga " + bungaPersen + "% per bulan";
    }

    @Override
    public boolean tarik (int jumlah) {

        //Exception in thread "main" java.lang.UnsupportedOperationException: Deposito tidak bisa ditarik
        //at Deposito.tarik(Deposito.java:31)
        //at ProsesAkhirBulan.autodebet(ProsesAkhirBulan.java:34)
        //at BankSolid.main(BankSolid.java:26)

        //Process finished with exit code 1

        return false;
    }
}
