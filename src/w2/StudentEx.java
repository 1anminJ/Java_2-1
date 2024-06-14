package w2;

public class StudentEx {
    public static void main(String[] args){
        Student stu1 = new Student("한민정", "20230842", "컴퓨터소프트웨어공학과", "010-8477-9186");
        Student stu2 = new Student("유재석", "20240888", "한국컨텐츠예능학과", "010-1234-5678");
        System.out.println("         이름       학번         학과          연락처");
        System.out.println("학생 1 : " + stu1.getName() + ", " + stu1.getStuId() + ", " + stu1.getDept() + ", " + stu1.getTel());
        System.out.println("학생 2 : " + stu2.getName() + ", " + stu2.getStuId() + ", " + stu2.getDept() + ", " + stu2.getTel());

    }
}
