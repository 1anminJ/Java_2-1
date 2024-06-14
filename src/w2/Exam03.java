package w2;

public class Exam03 {
    public static void main(String[] args){
        int count = 90;
        if(count >= 90){
            System.out.println("if => 합격(장학생)");
        } else if (count >= 60){
            System.out.println("if => 합격");
        } else {
            System.out.println("if => 불합격");
        }
        int jumsu = (count / 10) * 10;
        switch (count){
            case 100: case 90:
                System.out.println("sw => 합격(장학생)");
                break;
            case 80: case 70: case 60:
                System.out.println("sw => 합격");
                break;
            default:
                break;
        }

    }
}
