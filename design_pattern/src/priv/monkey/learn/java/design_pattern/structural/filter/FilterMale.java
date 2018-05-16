package priv.monkey.learn.java.design_pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMale implements IFilter {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person p : persons) {
            if (p.getGender().equals(IFilter.MALE)) {
                malePersons.add(p);
            }
        }
        return malePersons;
    }
}
