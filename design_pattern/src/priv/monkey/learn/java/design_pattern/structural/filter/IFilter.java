package priv.monkey.learn.java.design_pattern.structural.filter;

import java.util.List;

public interface IFilter {
    String MALE = "MALE";
    String FEMALE = "FEMALE";
    List<Person> meetCriteria(List<Person> persons);
}
