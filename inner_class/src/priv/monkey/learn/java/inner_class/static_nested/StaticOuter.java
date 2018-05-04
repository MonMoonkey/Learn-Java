package priv.monkey.learn.java.inner_class.static_nested;


public class StaticOuter {

    private static final String OUT = "StaticOuter" ;
    private static final String IN = "StaticInner" ;

    public String outA ="StaticOuter的public成员变量outA";
    private String outB="StaticOuter的private成员变量outB";
    static String outC="StaticOuter的static成员变量outC";

    static String inOut="StaticOuter与StaticInner相同名的StaticOuter的成员变量";

    public void outX(){
        System.out.println("StaticOuter类的public方法！");
    }

    private void outY(){
        System.out.println("StaticOuter类的private方法！");

    }

    static void outZ(){
        System.out.println("StaticOuter类的static方法！");

    }

    void inOutMethod(){
        System.out.println("StaticOuter与StaticInner相同方法名的StaticOut类的方法");
    }

    /**
     * Outer类获取Inner类的成员变量和方法
     */
    void outAccessIn(){
        // 获取Inner类的私有成员变量
        StaticInner staticInner = new StaticInner();
        System.out.println(new StaticInner().inA);
        // 调用Inner类的私有方法
        new StaticInner().inMethod();
    }

    /**
     * 成员内部类不能含有static的变量和方法，成员内部类只有先创建外部类后才能创建
     */
    private static class StaticInner{
        private static String inA="StaticOuter的Inner的private成员变量inA";
        String inOut="StaticOuter与StaticInner相同名的StaticInner成员变量";

        /**
         * Inner类不可以访问Outer类非静态变量和方法
         */
        private void inAccessOut(){
            //Inner类可以不可以访问out类的非静态变量
//            System.out.println(outA+outB);
            System.out.println(outC);
            //Inner类不可以访问out类的非静态方法
//            outX();
//            outY();
            outZ();
            /**
             * 当Inner类和Outer类用拥有相同名字的成员变量或方法，调用方法为
             * 外部类.this.成员变量/方法
             */
            System.out.println(new StaticOuter().inOut);
            System.out.println(inOut);
            new StaticOuter().inOutMethod();
            inOutMethod();
        }

        private void inMethod(){
            System.out.println("StaticInner类的private方法！");
        }

        void inOutMethod(){
            System.out.println("StaticOuter与StaticInner相同方法名的StaticInner类的方法");
        }


    }


}

