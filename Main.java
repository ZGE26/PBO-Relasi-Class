public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("123", "Budi");
        Mahasiswa mhs2 = new Mahasiswa("124", "Andi");
        Mahasiswa mhs3 = new Mahasiswa("125", "Caca");
        Mahasiswa mhs4 = new Mahasiswa("126", "Dedi");

        Jurusan jurusan = new Jurusan("IF", "Informatika");
        Jurusan jurusan2 = new Jurusan("SI", "Sistem Informasi");

        jurusan.addMsh(mhs1);
        jurusan.addMsh(mhs2);
        jurusan2.addMsh(mhs3);
        jurusan2.addMsh(mhs4);


        PerulanganCetak(jurusan);
        PerulanganCetak(jurusan2);

    }

    //Cetak Mahasiswa
    public static void CetakMahasiswa(Mahasiswa mhs) {
        System.out.println(" - NIM: " + mhs.getNim());
        System.out.println(" - Nama: " + mhs.getNama());
        System.out.println();
    }
    //Perulangan Cetak
    public static void PerulanganCetak(Jurusan jurusan) {
        System.out.println("Kode Jurusan: " + jurusan.getKode());
        System.out.println("Nama Jurusan: " + jurusan.getNama());
        System.out.println();
        System.out.println("Daftar Mahasiswa: ");
        for (Mahasiswa mhs : jurusan.getMahasiswa()) {
            CetakMahasiswa(mhs);
        }
    }
}
