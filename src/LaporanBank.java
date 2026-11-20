public class LaporanBank {

    public void cetakDaftar(String judul, Rekening[] semua) {

        System.out.println("\n========== " + judul + " ==========");

        for (Rekening r : semua) {

            System.out.println(
                    r.getNomor() + " | " +
                            r.getPemilik() + " | " +
                            Rekening.formatRupiah(r.getSaldo())
            );

            System.out.println("    " + r.keterangan());
        }
    }

    public void cetakTotal(Rekening[] semua) {

        int totalDanaBank = 0;

        for (Rekening r : semua) {
            totalDanaBank += r.getSaldo();
        }

        System.out.println("-----------------------------------");

        System.out.println(
                "Total dana bank : " +
                        Rekening.formatRupiah(totalDanaBank)
        );
    }
}
