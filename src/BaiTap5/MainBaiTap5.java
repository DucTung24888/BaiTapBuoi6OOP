package BaiTap5;

public class MainBaiTap5 {
    public static void main(String[] args) {
        Person student = new Student("tung","Ha Noi","Dai Hoc",22,2.5);
        System.out.println(student.toString());
        Person staff = new Staff("hien","ThanhHoa","DaiHoc",2.5);
        System.out.println(staff.toString());
    }
}
