
public class Main {

    public static void main(String[] args) {
        cmp202 cmp202 = new cmp202();
        cmp202.printUserDetails();

        Person student = new Person("Bingham", "Anath", "12345", "0107");
        Person staff = new Person(89, "1234", "Anath", "Bingham");

        Physics calculate = new Physics();
        System.out.println(calculate.calculateVelocity(50, 10));
        System.out.println(calculate.calculateVelocity(7, 15, 2));
        System.out.println(student);
        //System.out.println(Person.getName());


    }
}
