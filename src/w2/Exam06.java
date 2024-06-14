package w2;

public class Exam06 {
    public static void main(String[] args) {
        try {
            int num1 = 100, num2 = 0;
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println("에러가 발생했대~~");
            System.out.println(e);      // 발생한 에러 정보
            e.printStackTrace();        // 발생한 에러를 스택형식으로 저장하여 보여줌
        }
    }
}
