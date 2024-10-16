package bagian2;

import java.util.List;

public class Hospital {
	private String name;
    private Integer id;
    private List<Nurse> nurses;

    public Hospital(String name, Integer id, List<Nurse> nurses) {
        if(nurses.size() < 2) {
            throw new IllegalArgumentException("Jumlah perawat tidak boleh kurang dari 2");
        } 
        this.name = name;
        this.id = id;
        this.nurses = nurses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        if(nurses.size() < 2) {
            throw new IllegalArgumentException("Jumlah perawat tidak boleh kurang dari 2");
        } 
        this.nurses = nurses;
    }
}
