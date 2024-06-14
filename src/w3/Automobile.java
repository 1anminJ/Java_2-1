package w3;

public class Automobile extends Car{
    private int seatNum;

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    void upSpeed(int value){
        if(speed + value >= 300)
            speed = 300;
        else
            speed = speed + (int)value;
    }
}
