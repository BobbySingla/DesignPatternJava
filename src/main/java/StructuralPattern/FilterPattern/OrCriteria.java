package StructuralPattern.FilterPattern;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria criteria1;
    public OrCriteria(Criteria criteria,Criteria criteria1){
        this.criteria=criteria;
        this.criteria1=criteria1;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList=criteria.meetCriteria(persons);
        List<Person> personList1=criteria1.meetCriteria(persons);
        for (Person person:personList1){
            if(!personList.contains(person)){
                personList.add(person);
            }
        }
        return personList;
    }
}
