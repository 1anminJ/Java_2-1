import java.nio.charset.CharacterCodingException;

// 설계도, main() 없음
public class Car {
    // 1. 필드(속성)
    private String color;
    protected int speed = 0;    // 자식 클래스에게 보여주는 속성
    static int carCount = 0;
    final static int MAXSPEED = 200;
    final static int MINSPEED = 0;

    static int currentCarCount(){
        return carCount;
    }

    // 2. 생성자
    public Car(String color, int speed) {
        super();
        this.color = color;
        this.speed = speed;
        carCount++;
    }

    Car() {
        carCount++;
    };   // 기본생성자

    // 3. 메소드
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void upSpeed(int value){
        if(speed + value >= 200)
            speed = 200;
        else
            speed = speed + value;
    }

    void downSpeed(int value){
        if(speed - value <= 0)
            speed = 0;
        else
            speed = speed - value;
    }
}
