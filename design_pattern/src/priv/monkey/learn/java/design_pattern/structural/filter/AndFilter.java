package priv.monkey.learn.java.design_pattern.structural.filter;

import java.util.List;

public class AndFilter implements IFilter {
    private IFilter iFilter1;
    private IFilter iFilter2;

    public AndFilter(IFilter f1,IFilter f2) {
        this.iFilter1=f1;
        this.iFilter2=f2;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstFilteredPersons = iFilter1.meetCriteria(persons);
        List<Person> finalFilteredPersons = iFilter2.meetCriteria(firstFilteredPersons);
        return finalFilteredPersons;
    }
}
