package StructuralPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> maleperson = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                maleperson.add(person);
            }
        }
        return maleperson;

    }
}