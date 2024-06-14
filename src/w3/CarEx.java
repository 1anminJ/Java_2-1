package w3;

public class CarEx {
    public static void main(String[] args){
        Car myCar = new Car("빨강", 70);
        Car ummacar = new Car("파랑", 20);
        Car appacar = new Car("초록", 100);

        System.out.println("내차 : " + myCar.getColor() + ", " + myCar.getSpeed());
        System.out.println("엄마차 : " + ummacar.getColor() + ", " + ummacar.getSpeed());
        System.out.println("아빠차 : " + appacar.getColor() + ", " + appacar.getSpeed());

        System.out.println("최고 속도 = " + Car.MAXSPEED);
        System.out.println(Car.currentCarCount());

        System.out.println(Math.PI);
        System.out.println(Math.abs(-10));
        System.out.println(Math.pow(3,5));




    }

}
