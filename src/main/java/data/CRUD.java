package data;

public interface CRUD {
    void tambahDonor(Donor donor);
    void hapusDonor(int id);
    void updateDonor(int id, String namaBaru, int usiaBaru, String golonganDarahBaru);
    void tampilkanSemuaDonor();
    void cariDonor(int id);
}
