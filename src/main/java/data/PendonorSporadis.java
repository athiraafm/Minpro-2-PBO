package data;

public final class PendonorSporadis extends Donor {
    private final String event;

    public PendonorSporadis(String nama, int usia, String golonganDarah, String event) {
        super(nama, usia, golonganDarah);
        this.event = event;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("| %-3d | %-20s | %-4d | %-3s | Sporadis (%s) |\n", 
            getId(), getNama(), getUsia(), getGolonganDarah(), event);
    }
}
