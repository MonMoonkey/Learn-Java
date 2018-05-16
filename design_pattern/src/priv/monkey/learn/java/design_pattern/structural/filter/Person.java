package priv.monkey.learn.java.design_pattern.structural.filter;

public class Person {
    private String name;
    private String gender;
    private int grade;

    public Person(String name,String gender,int grade){
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }
}
