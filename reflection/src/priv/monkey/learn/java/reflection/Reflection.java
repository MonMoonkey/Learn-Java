package priv.monkey.learn.java.reflection;

import priv.monkey.learn.java.annotation.MonkeyAnnotation;

@MonkeyAnnotation(color = MonkeyAnnotation.Color.RED,name = "Moon",length = 16)
public class Reflection implements IReflection{
    private String name = "abd";
    public int num = 8;
    protected long time = 10000;


    public Reflection(String s) {
        this.name = s;
    }

    public Reflection(String s, int n) {
        System.out.println("String + int");
        this.name=s;
        this.num = n;
    }
    public Reflection(int n,String s) {
        System.out.println("int + String");
        this.name=s;
        this.num = n;
    }

    public Reflection() {
    }

    private Reflection(long l) {
        this.time = l;
    }

    @MonkeyAnnotation(name="haha",length = 1,color = MonkeyAnnotation.Color.RED)
    public void pubMethod() {
        System.out.println("public: "+this.name);
    }

    public String pubMethod(String s, int a) {
        return s + "  " + a;
    }

    private void privMethod() {
        System.out.println("private: "+this.num);
    }


    @Override
    @MonkeyAnnotation
    public void pleaseImplement() {
        System.out.println("Implemented");
    }
}
