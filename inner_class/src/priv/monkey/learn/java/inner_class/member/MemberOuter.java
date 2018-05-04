package priv.monkey.learn.java.inner_class.member;

/**
 * 1、内部类可直接使用外部类的私有,静态成员变量或方法（所有成员变量和方法），外部类对内部类是可见的；
 *
 * 2、外部类中可以创建私有内部类对象。
 *
 * 3、外部类可通过内部类的对象调用内部类的私有成员变量或方法；
 *
 * 4、当内部类与外部类有同名成员变量和方法时，内部类可通过Outer.this方式来引用外部类成员。
 *
 * 5、必须先创建外部类才能创建内部类。
 *
 * 6、成员内部类不能含有static的变量和方法。因为成员内部类需要先创建外部类，才能创建它自己的。
 */
public class MemberOuter {

    private static final String OUT = "MemberOuter" ;
    private static final String IN = "MemberInner" ;

    public String outA ="MemberOuter的public成员变量outA";
    private String outB="MemberOuter的private成员变量outB";
    static String outC="MemberOuter的static成员变量outC";

    String inOut="MemberOuter与MemberInner相同名的MemberOuter的成员变量";

    public void outX(){
        System.out.println("MemberOuter类的public方法！");
    }

    private void outY(){
        System.out.println("MemberOuter类的private方法！");

    }

    static void outZ(){
        System.out.println("MemberOuter类的static方法！");

    }

    void inOutMethod(){
        System.out.println("MemberOuter与MemberInner相同方法名的MemberOut类的方法");
    }

    /**
     * Outer类获取Inner类的成员变量和方法
     */
    void outAccessIn(){
        // 获取Inner类的私有成员变量
        System.out.println(new MemberInner().inA);
        // 调用Inner类的私有方法
        new MemberInner().inMethod();
    }

    /**
     * 成员内部类不能含有static的变量和方法，成员内部类只有先创建外部类后才能创建
     */
    private class MemberInner{
        private String inA="MemberOuter的Inner的private成员变量inA";
        String inOut="MemberOuter与MemberInner相同名的MemberInner成员变量";

        /**
         * Inner类相当于Outer类的成员，可以访问Outer类的所有（包括私有和静态）变量和方法
         */
        private void inAccessOut(){
            //Inner类可以访问out类的所有变量
            System.out.println(outA+outB+outC);
            //Inner类可以访问out类的所有方法
            outX();
            outY();
            outZ();
            /**
             * 当Inner类和Outer类用拥有相同名字的成员变量或方法，调用方法为
             * 外部类.this.成员变量/方法
             */
            System.out.println(MemberOuter.this.inOut);
            System.out.println(inOut);
            MemberOuter.this.inOutMethod();
            inOutMethod();
        }

        private void inMethod(){
            System.out.println("MemberInner类的private方法！");
        }

        void inOutMethod(){
            System.out.println("MemberOuter与MemberInner相同方法名的MemberInner类的方法");
        }


    }

    
}
