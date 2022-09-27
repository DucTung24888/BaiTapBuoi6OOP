package TinhDaHinh;

public class Main {
    public static void main(String[] args) {
        Person programmer = new Programmer();
        programmer.eat();
        programmer.learn();
        programmer.walk();

        Person dancer = new Dancer();
        dancer.eat();
        dancer.learn();
        dancer.walk();

        Person singer = new Singer();
        singer.walk();
        singer.learn();
        singer.eat();
    }
}
