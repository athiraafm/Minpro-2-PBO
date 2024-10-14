package data;

public final class PendonorTetap extends Donor {
    private final int jumlahDonasi;

    public PendonorTetap(String nama, int usia, String golonganDarah, int jumlahDonasi) {
        super(nama, usia, golonganDarah);
        this.jumlahDonasi = jumlahDonasi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("| %-3d | %-20s | %-4d | %-3s | Tetap (%d kali) |\n", 
            getId(), getNama(), getUsia(), getGolonganDarah(), jumlahDonasi);
    }
}
