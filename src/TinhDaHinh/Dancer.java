package TinhDaHinh;

public class Dancer extends Person {
    private String groupName;
    protected void dancing(){
        System.out.println("dancing of Dancer");
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    protected void learn(){
        System.out.println("lear of dancer");
    }
    protected void walk(){
        System.out.println("walk of dancer");
    }
    protected void eat(){
        System.out.println("eat of dancer");
    }
    public Dancer(){
    }
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
}
