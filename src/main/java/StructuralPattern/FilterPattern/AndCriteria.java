package StructuralPattern.FilterPattern;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria criteria1;

    public AndCriteria(Criteria criteria, Criteria criteria1) {
        this.criteria = criteria;
        this.criteria1 = criteria1;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = criteria.meetCriteria(persons);

        return criteria1.meetCriteria(personList);
    }
}
