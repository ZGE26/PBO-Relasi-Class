import java.util.*;

public class Jurusan {

    private String kode;
    private String nama;
    private List<Mahasiswa> mahasiswa;

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        mahasiswa = new ArrayList<>();
    }

    public String addMsh(Mahasiswa mahasiswa) {
        this.mahasiswa.add(mahasiswa);
        return "Mahasiswa berhasil ditambahkan";
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public List<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }
}