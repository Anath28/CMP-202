public class Person {
    private String schoolName = "Bingham university";
    private String name;
    private String password;
    private String matricno;
    int staffNo = 123;

    public Person(String schoolName, String name, String password, String matricno) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.matricno = matricno;
    }

    String getName(){
        return name;
    }

    public Person(int staffNo, String password, String name, String schoolName) {
        this.staffNo = staffNo;
        this.password = password;
        this.name = name;
        this.schoolName = schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
