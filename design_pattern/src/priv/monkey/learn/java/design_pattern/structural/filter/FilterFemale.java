package priv.monkey.learn.java.design_pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterFemale implements IFilter {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person p : persons) {
            if (p.getGender().equals(IFilter.FEMALE)) {
                femalePersons.add(p);
            }
        }
        return femalePersons;
    }
}
