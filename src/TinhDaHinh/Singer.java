package TinhDaHinh;

public class Singer extends Person {
    private String bandName;
    protected void singing(){
        System.out.println("Singing of Singer");
    }
    public Singer(){

    }
    protected void playGitar(){
        System.out.println("PlayGitar of Singer");
    }

    @Override
    protected void learn() {
        System.out.println("learn of Singer");
    }

    @Override
    protected void eat() {
        System.out.println("eat of singer");
    }

    @Override
    protected void walk() {
        System.out.println("walk of singer");
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
