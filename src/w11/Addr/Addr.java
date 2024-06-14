package w11.Addr;

import java.time.LocalDate;
import java.time.LocalDateTime;

// 클래스, 청사진, 붕어빵틀
public class Addr {
    // 필드
    private String name; // 이름
    private String tel;  // 전화번호
    private String com;  // 회사명
    private LocalDateTime createDate;   // 생성일 날짜시분초
    // 생성자, 초기값 자동으로 작성
    public Addr(String name, String tel, String com, LocalDateTime createDate) {
        this.name = name;
        this.tel = tel;
        this.com = com;
        this.createDate = createDate;
    }
    // toString(), getter, setter 자동으로 작성
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", com='" + com + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}