package BaiTap2TinhDaHinh;

public class Singer extends Person {
    private String bandName;
    protected void singing(){
        System.out.println("Singing of Singer");
    }
    protected void playGitar(){
        System.out.println("PlayGitar of Singer");
    }
//    protected void eat(String food) {
//        System.out.println(food);
//    }
    public Singer(){}
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
