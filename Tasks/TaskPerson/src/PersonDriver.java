import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PersonDriver {
    public static void main(String[] args) {

        Person p1 = new Person("Israel Israeli", 22, 10, 1993, "123456789");
        Person p2 = new Person(p1.getName(),
                p1.getDateOfBirth().getDay(),
                p1.getDateOfBirth().getMonth(),
                p1.getDateOfBirth().getYear(),
                p1.getId());

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        if (name.length() < 2) {
            name = "Someone";
            System.out.println("Entered name lenght < 2. Name has been reset to \"Someone\"");
        }

        System.out.print("Input id: ");
        String id = in.nextLine();
        if (id.length() != 9) {
            id = "000000000";
            System.out.println("Entered id length not 9. Id has been reset to \"00000000\"");
        }

        System.out.print("Input day: ");
        int day = in.nextInt();

        System.out.printf("Input month:");
        int month = in.nextInt();

        System.out.printf("Input year:");
        int year = in.nextInt();
        in.close();

        //Bet
        Person p3 = new Person(name, day, month, year, id);
        if (p1.equals(p3)) {
            System.out.println("Same person");
        } else {
            System.out.println("different person");
        };

        //Gimel
        p2.setName("Miriam Levi");
        p2.setId("123123123");
        p3.setDateOfBirth(new Date(9,1, 1990));

        //Dalet - name of the yongest arendator
        List<Person> persons = Arrays.asList(p1, p2, p3);

        Person yongestPerson = persons.get(0);
        for (Person person : persons) {
            if(person.compare(yongestPerson) == -1) {
                yongestPerson = person;
            }
        }
        System.out.println(yongestPerson.getName());


    }
}