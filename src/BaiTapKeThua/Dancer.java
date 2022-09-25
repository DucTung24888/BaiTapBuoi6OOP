public class Dancer extends Person{
    private String groupName;
    protected void dancing(){
        System.out.println("dancing of Dancer");
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
}
