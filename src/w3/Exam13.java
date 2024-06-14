package w3;

import java.util.ArrayList;

public class Exam13 {
    public static void main(String args[]){
        ArrayList<String> deptList = new ArrayList<>();
        deptList.add("컴소과");
        deptList.add("컴정과");
        deptList.add("인소과");

        for (String item : deptList) {
            System.out.println(item);
        }
        //----------------------------------------------
        ArrayList<Car> carList = new ArrayList<>();
        Car myCar = new Car("빨강", 50);
        Car ummaCar = new Car("파랑", 20);
        carList.add(myCar);
        carList.add(ummaCar);
        carList.add(new Car("초록", 100));
        carList.add(new Car("하양", 40));

        for (Car carone : carList){
            System.out.println(carone.getColor() + carone.getSpeed());
        }

    }
}
