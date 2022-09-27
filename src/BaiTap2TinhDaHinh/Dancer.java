package BaiTap2TinhDaHinh;

public class Dancer extends Person {
    private String groupName;

//    protected void eat(String food) {
//        System.out.println(food);
//    }
    public Dancer(){}
    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
}
