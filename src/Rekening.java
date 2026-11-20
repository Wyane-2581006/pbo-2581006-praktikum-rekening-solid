import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class Rekening {

    private String nomor;
    private String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }

        saldo += jumlah;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    public abstract int biayaAdminBulanan();

    public int potongBiayaAdmin() {
        int biaya = biayaAdminBulanan();

        saldo -= biaya;

        return biaya;
    }

    //Kontrak penarikan:
    //True = berhasil, false = gagal, tidak pernah melempar exception

    public abstract String keterangan();

    protected static String formatRupiah(int jumlah) {
        DecimalFormatSymbols simbol =
                new DecimalFormatSymbols(new Locale("id", "ID"));

        DecimalFormat format =
                new DecimalFormat("'Rp'#,##0", simbol);

        return format.format(jumlah);
    }
}
