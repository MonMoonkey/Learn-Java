package priv.monkey.learn.java.design_pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("AAA", IFilter.FEMALE, 65));
        persons.add(new Person("BBB", IFilter.MALE, 20));
        persons.add(new Person("CCC", IFilter.MALE, 31));
        persons.add(new Person("DDD", IFilter.MALE, 100));
        persons.add(new Person("EEE", IFilter.FEMALE, 59));
        persons.add(new Person("FFF", IFilter.FEMALE, 70));
        persons.add(new Person("GGG", IFilter.MALE, 80));
        persons.add(new Person("HHH", IFilter.FEMALE, 90));
        persons.add(new Person("III", IFilter.FEMALE, 75));
        persons.add(new Person("JJJ", IFilter.MALE, 65));
        persons.add(new Person("KKK", IFilter.FEMALE, 88));
        persons.add(new Person("LLL", IFilter.FEMALE, 78));

        IFilter maleFilter = new FilterMale();
        IFilter femaleFilter = new FilterFemale();
        IFilter passExamFilter = new FilterPassExam();
        IFilter femalePass = new AndFilter(femaleFilter, passExamFilter);
        IFilter maleOrPass = new OrFilter(maleFilter, passExamFilter);

        printPersons("All males",maleFilter.meetCriteria(persons));
        printPersons("All females",femaleFilter.meetCriteria(persons));
        printPersons("All pass",passExamFilter.meetCriteria(persons));
        printPersons("Female and Pass",femalePass.meetCriteria(persons));
        printPersons("Males or Pass",maleOrPass.meetCriteria(persons));

    }

    private static void printPersons(String title,List<Person> persons) {
        System.out.println(title+":"+persons.size());
        for (Person person : persons) {
            System.out.println("Person : [ Name:" + person.getName()
                    +", Gender:" + person.getGender()
                    +", Grade:" + person.getGrade()
                    +" ]");
        }
        System.out.println();
    }
}
