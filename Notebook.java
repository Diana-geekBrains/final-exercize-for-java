package Final_exersize_java;


public class Notebook {
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Notebook(int ram, int storage, String os, String color) {
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "RAM: " + ram + "GB, Storage: " + storage + "GB, OS: " + os + ", Color: " + color;
    }
}


