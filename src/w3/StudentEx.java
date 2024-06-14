package w3;

import java.util.ArrayList;

public class StudentEx {
    public static void main(String args[]){
        ArrayList<Student> sList = new ArrayList<>();

        sList.add(new Student("한민정", "20230842", "컴퓨터소프트웨어공학과", "010-8477-9186"));
        sList.add(new Student("유재석", "20241234", "미디어예능학과", "010-1234-5742"));
        sList.add(new Student("하하", "20241345", "미디어예능학과", "010-1454-5742"));
        sList.add(new Student("별", "20241393", "실용음악과", "010-1794-5738"));

//        for (Student student : sList){
//            System.out.println(student);
//        }

        // 전체 학생 수 출력
        System.out.println("전체 학생 수 : " + Student.getStuCount());
        // 전공 학과별 출력
        System.out.println("\n컴퓨터소프트웨어공학과");
        for (Student swstu : sList){
            if(swstu.getDept().equals("컴퓨터소프트웨어공학과"))
                System.out.println(swstu);
        }
        System.out.println("\n미디어예능학과");
        for (Student mdstu : sList){
            if(mdstu.getDept().equals("미디어예능학과"))
                System.out.println(mdstu);
        }
        System.out.println("\n실용음악과");
        for (Student mustu : sList){
            if(mustu.getDept().equals("실용음악과"))
                System.out.println(mustu);
        }
    }
}