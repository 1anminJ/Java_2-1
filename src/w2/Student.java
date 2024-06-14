public class Student {
    // 필드
    private String name, stuId, dept, tel;
    // 생성자
    public Student(String name, String stuId, String dept, String tel) {
        this.name = name;
        this.stuId = stuId;
        this.dept = dept;
        this.tel = tel;
    }
    //메소드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
}
