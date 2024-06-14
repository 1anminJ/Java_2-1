public class Phone {
    private String pName, company;
    private int price;
    static int pCount = 0;

    // 생성자
    public Phone(String pName, String company, int price) {
        this.pName = pName;
        this.company = company;
        this.price = price;
        pCount++;
    }
    Phone(){
        pCount++;
    }
    // 메소드
    static int getpCount(){
        return pCount;
    }
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "폰 이름 : " + getpName() + ", 제조사 : " + getCompany() + ", 가격 : " + getPrice();
    }
}
