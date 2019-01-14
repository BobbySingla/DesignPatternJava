package StructuralPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class SinglePersons implements Criteria{
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singleperson = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singleperson.add(person);
            }
        }
        return singleperson;

    }
}
