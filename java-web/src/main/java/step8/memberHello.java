package step8;

public class memberHello {

    private String name;
    private String age;
    private String school;
    private String address;
    private String money;
    
    
    
    @Override
    public String toString() {
        return "memberHello [name=" + name + ", age=" + age + ", school=" + school + ", address=" + address + ", money="
                + money + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = money;
    }
    
    
    
    
}
