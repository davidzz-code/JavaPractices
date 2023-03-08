package ExamenIncaPrueba.Ejercico5;

public class Computers {
    private String id;
    private String aula;
    private int ram;
    private int hd;
    private int speed;

    public Computers(String id, String aula, int ram, int hd, int speed) {
        this.id = id;
        this.aula = aula;
        this.ram = ram;
        this.hd = hd;
        this.speed = speed;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public String getAula() {
        return aula;
    }

    public String getId() {
        return id;
    }

    public String clasifica() {
        if (speed > 3 && ram > 16) {
            return "ultimate";
        }
        else {
            return "normal";
        }
    }
}
