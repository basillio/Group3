package Module7.main.com.app;

import java.util.List;

/**
 * Created by vberezovskii on 22.07.2016.
 */
public interface BussinessTask {
    public void save(Person person);

    public void bulkSave(List<Person> person);

    public List<Person> getAllPersons();

    public Person getPersons(String name);
    public Person getPersons(int age);

    public int getsize();

}

