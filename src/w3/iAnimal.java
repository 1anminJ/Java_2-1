package w3;


public interface iAnimal{
    void eat();
}

class iCat implements iAnimal{
    @Override
    public void eat() {
        System.out.println("생선을 좋아한다.");
    }
}

class iTiger extends Animal implements iAnimal{
    @Override
    void move() {
        System.out.println("4발로 이동한다.");
    }
    @Override
    public void eat() {
        System.out.println("멧돼지를 좋아한다.");
    }
}

