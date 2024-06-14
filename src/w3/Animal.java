abstract public class Animal {
    String name;
    abstract void move();
}

class Tiger extends Animal{
    int age;
    @Override
    void move() {
        System.out.println("4발로 걸어간다.");
    }
}

class Eagle extends Animal{
    String home;
    @Override
    void move() {
        System.out.println("날개로 날아간다.");
    }
}
