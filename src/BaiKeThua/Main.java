public class Main {
    public static void main(String[] args) {
        Person programmer = new Programmer();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.setName("tung") ;
        System.out.println(programmer.getName());
    }
}
