
public class Person {
    private String name;
    private String designation;
    protected void learn(){
        System.out.println("learn of Person");
    }
    protected void walk(){
        System.out.println("walk of Person");
    }
    protected void eat(){
        System.out.println("eat of Person");
    }

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
