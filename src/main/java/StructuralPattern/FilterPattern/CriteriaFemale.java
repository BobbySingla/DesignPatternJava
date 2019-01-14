package StructuralPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femaleperson = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femaleperson.add(person);
            }
        }
            return femaleperson;

    }
}
