public class Student {
    // 필드
    private String name, stuId, dept, tel;

    static int stuCount = 0;

    // 생성자


    public Student(String name, String stuId, String dept, String tel) {
        this.name = name;
        this.stuId = stuId;
        this.dept = dept;
        this.tel = tel;
        stuCount++;
    }

    Student(){
        stuCount++;
    }

    static int getStuCount(){
        return stuCount;
    }
    //메소드


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
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

    @Override
    public String toString() {
        return "이름 : " + getName() + ", 학번 : " + getStuId() + ", 전공 : " + getDept() + ", 전화번호 : " + getTel() ;
    }
}
