package w3;

import java.util.ArrayList;

public class PhoneEx {
    public static void main(String args[]){
        ArrayList<Phone> pList = new ArrayList<>();

        pList.add(new Phone("갤럭시S23", "삼성전자", 1000000));
        pList.add(new Phone("갤럭시S20", "삼성전자", 200000));
        pList.add(new Phone("아이폰14", "애플", 1500000));
        pList.add(new Phone("갤럭시A33", "삼성전자", 2000000));
        pList.add(new Phone("아이폰13", "애플", 900000));

        // 제조사별 출력
        System.out.println("삼성전자");
        for (Phone sPhone : pList){
            if(sPhone.getCompany().equals("삼성전자"))
                System.out.println(sPhone);
        }
        System.out.println("\n애플");
        for (Phone iPhone : pList){
            if(iPhone.getCompany().equals("애플"))
                System.out.println(iPhone);
        }
        // 100만원 미만 폰 출력
        System.out.println("\n100만원 미만의 폰");
        for (Phone oneunder : pList){
            if(oneunder.getPrice() <= 1000000)
                System.out.println(oneunder);
        }
        // 휴대폰 갯수 출력
        System.out.println("\n전체 휴대폰 갯수 : " + Phone.getpCount());
    }
}
