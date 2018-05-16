package priv.monkey.learn.java.design_pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterPassExam implements IFilter{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> passExamPersons = new ArrayList<>();
        for (Person p : persons) {
            if (p.getGrade() >= 60) {
                passExamPersons.add(p);
            }
        }
        return passExamPersons;
    }
}
