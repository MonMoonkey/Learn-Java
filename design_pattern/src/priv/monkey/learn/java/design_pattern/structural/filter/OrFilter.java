package priv.monkey.learn.java.design_pattern.structural.filter;

import java.util.List;

public class OrFilter implements IFilter{
    private IFilter iFilter1;
    private IFilter iFilter2;

    public OrFilter(IFilter f1,IFilter f2) {
        this.iFilter1=f1;
        this.iFilter2=f2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstFilteredPersons = iFilter1.meetCriteria(persons);
        List<Person> secondFilteredPersons = iFilter2.meetCriteria(persons);
        for (Person p : secondFilteredPersons) {
            if (!firstFilteredPersons.contains(p)) {
                firstFilteredPersons.add(p);
            }
        }
        return firstFilteredPersons;
    }
}
