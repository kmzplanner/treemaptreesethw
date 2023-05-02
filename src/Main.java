import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Petya","Petrov graf from city", 68));
        personList.add(new Person("Vasya","Vasilev", 54));
        personList.add(new Person("Oleg","Olegov dvoryanin", 32));
        personList.add(new Person("Sanya","Aleksandrov graf cantry", 38));
        personList.add(new Person("Vladimir","Vladimir graf from city", 70));
        personList.add(new Person("Vasya2","Vasilev2", 55));
        personList.add(new Person("Vasya3","Vasilev3", 17));
        personList.add(new Person("Vasya4","Vasilev4 dvorynin", 16));

        System.out.println(personList);
        Collections.sort(personList, new PersonSurnameLengthComparator());
        System.out.println(personList);

        Predicate<Person> predicate = (person -> person.getAge() < 18);
        personList.removeIf(predicate);
        System.out.println(personList);
    }
}
