package priv.monkey.learn.java.inner_class.anonymous;

public class AnonymousOuter {
    private String inOut = "Outer inOut";
    private String out = "Outer out";

    public void main(){
        AnonymousOuter outer = new AnonymousOuter();
        outer.outAccessIn(new AnonymousInterface() {
            @Override
            public void interMethod() {

            }
        });

        outer.outAccessIn(new AnonymousAbstractInnerClass() {
            @Override
            public void abstractMethod() {

            }

            @Override
            public void interMethod() {
                outer.outMethod();
            }
        });

        outer.outAccessIn(new AnonymousInnerClass(){
            @Override
            public void interMethod() {
                super.interMethod();
            }

            @Override
            public void abstractMethod() {
                super.abstractMethod();
            }
        });
    }
    public void outAccessIn(AnonymousInterface inner){}

    private void outMethod() {

    }
}
