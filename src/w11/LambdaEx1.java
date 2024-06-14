package w11;

interface MyFunction{
    public abstract int calc(int x, int y);
}

interface MyFunction2{
    public abstract int calc2(int x);
}

interface MyFunction3{
    void print();
}

//1. interface
public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction add = (x, y) -> x + y;       // return 생략 시 이렇게 작성도 가능
        MyFunction minus = (x, y) -> x - y;     // return 있다면 무조건 {}로 둘러 싸기
        MyFunction gop = (x, y) -> x * y;
        MyFunction mok = (x, y) -> x / y;
        MyFunction nameji = (x, y) -> x % y;

        MyFunction min = (x, y) -> x < y ? x : y;
        MyFunction max = (x, y) -> x >= y ? x : y;

        System.out.println(add.calc(10, 2));
        System.out.println(minus.calc(10, 2));
        System.out.println(gop.calc(10, 2));
        System.out.println(mok.calc(10, 2));
        System.out.println(nameji.calc(10, 2));
        System.out.println("최대값 = " + max.calc(10, 2));
        System.out.println("최소값 = " + min.calc(10, 2));

        System.out.println("-----------------");
        /* Myfunction2 실습 */
        MyFunction2 square = x -> x * x;
        System.out.println(square.calc2(2));
        System.out.println("-----------------");
        /* MyFunction3*/
        MyFunction3 f = () -> {
            System.out.println("Hello 람다");
        };
        f.print();
        f = () -> System.out.println("안녕하세요~~");
        f.print();
    }

}