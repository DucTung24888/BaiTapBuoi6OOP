package TinhDaHinh;

public class Programmer extends Person {
    private String companyname;

    protected void coding() {
        System.out.println("coding of Programer");
    }

    public Programmer() {
    }

    @Override
    protected void learn() {
        System.out.println("learn of programmer");
    }

    @Override
    protected void walk() {
        System.out.println("walk of programmer");
    }

    @Override
    protected void eat() {
        System.out.println("eat of programmer");
    }


    public Programmer(String name, String designation, String companyname) {
        super(name, designation);
        this.companyname = companyname;
    }

    public String getCompanyname() {
        return companyname;
    }


    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

}
