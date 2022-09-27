package BaiTap3;

public class MainBaiTap3 {


    public static void main(String[] args) {
        Book book = new Book("tung",new Author("hien","hien@gmail",'m'),20,1);
        System.out.println(book.toString());
    }
}
