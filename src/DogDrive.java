public class DogDrive {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Gav, Gav");
        } else if (size > 14) {
            System.out.println("Vyf Vyf");
        } else {
            System.out.println("Tyaff Tyaff");
        }
    }

    void golas(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("Gavf");
            numOfBarks--;
        }
    }
}
