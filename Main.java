package bagian2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Nurse
        Nurse nurse1 = new Nurse("Alice", 1);
        Nurse nurse2 = new Nurse("Bob", 2);
        
        // Menambahkan perawat ke dalam daftar
        List<Nurse> nurseList = new ArrayList<>();
        nurseList.add(nurse1);
        nurseList.add(nurse2);
        
        // Membuat objek Hospital dengan daftar perawat
        Hospital hospital = new Hospital("RSU Sehat", 1, nurseList);
        
        // Menampilkan nama rumah sakit dan perawat yang terdaftar
        System.out.println("Nama Rumah Sakit: " + hospital.getName());
        for (Nurse nurse : hospital.getNurses()) {
            System.out.println("Perawat: " + nurse.getName() + " (ID: " + nurse.getId() + ")");
        }
    }
}
