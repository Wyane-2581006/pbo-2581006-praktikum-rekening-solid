
public class ProsesAkhirBulan {

    public void potongBiayaAdmin(Rekening[] semua) {

        for (Rekening r : semua) {

            int biaya = r.potongBiayaAdmin();

            System.out.println(
                    r.getNomor() + " biaya admin : " +
                            Rekening.formatRupiah(biaya)
            );
        }
    }

    public void tambahBunga(BerBunga[] berbunga) {

        for (BerBunga b : berbunga) {

            int bunga = b.tambahBunga();

            System.out.println(
                    b.getNomor() + " bunga       : " +
                            Rekening.formatRupiah(bunga)
            );
        }
    }

    public void autodebet(Rekening[] semua, int jumlah) {

        for (Rekening r : semua) {

            boolean berhasil = r.tarik(jumlah);

            if (berhasil) {
                System.out.println(
                        r.getNomor() + " autodebet   : " +
                                Rekening.formatRupiah(jumlah)
                );
            } else {
                System.out.println(
                        r.getNomor() + " autodebet   : gagal"
                );
            }
        }
    }
}
