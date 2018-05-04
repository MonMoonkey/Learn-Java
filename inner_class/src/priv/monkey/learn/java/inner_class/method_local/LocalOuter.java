package priv.monkey.learn.java.inner_class.method_local;


public class LocalOuter {


    public String outA = "LocalOuter的public成员变量outA";
    private String outB = "LocalOuter的private成员变量outB";
    static String outC = "LocalOuter的static成员变量outC";

    String inOut = "LocalOuter与LocalInner相同名的LocalOuter的成员变量";

    public void outMethod() {
        String outM = "LocalOuter的方法内的变量outM";
        String outA = "LocalOuter的方法内与成员变量相同名的变量outM";
        String inOut;

        /**
         * 局部内部类不能设定public，private，protected
         * 局部内部类不能被外部类创建实例
         * 创建内部类只能在内部类所在的方法中
         */
        class LocalInner {
            private String inA = "LocalOuter的Inner的private成员变量inA";
            String inOut = "LocalOuter与LocalInner相同名的LocalInner成员变量";

            /**
             * Inner类相当于Outer类的成员，可以访问Outer类的所有（包括私有和静态）变量和方法
             */
            private void inAccessOut() {
                //Inner类可以访问out类的所有变量
                System.out.println(LocalOuter.this.outA + outA + outB + outC);
                //Inner类可以访问out类的所有方法
                outX();
                outY();
                outZ();
                /**
                 * 当Inner类和Outer类用拥有相同名字的成员变量或方法，调用方法为
                 * 外部类.this.成员变量/方法
                 */
                System.out.println(LocalOuter.this.inOut);
                System.out.println();
                System.out.println(inOut);
                LocalOuter.this.inOutMethod();
                inOutMethod();
            }

            private void inMethod() {
                System.out.println("LocalInner类的private方法！");
            }

            void inOutMethod() {
                System.out.println("LocalOuter与LocalInner相同方法名的LocalInner类的方法");
            }
        }
        /**
         * 要在内部类定义后创建实例
         */
        LocalInner localInner = new LocalInner();
        localInner.inMethod();
        System.out.println(localInner.inA);
    }

    public void outX() {
        System.out.println("LocalOuter类的public方法！");
    }

    private void outY() {
        System.out.println("LocalOuter类的private方法！");

    }

    static void outZ() {
        System.out.println("LocalOuter类的static方法！");

    }

    void inOutMethod() {
        System.out.println("LocalOuter与LocalInner相同方法名的LocalOut类的方法");
    }

    /**
     * Outer类获取Inner类的成员变量和方法
     */
    void outAccessIn() {
        // 不能在方法外实例化内部类
//        System.out.println(new LocalOuter.LocalInner().inA);
        // 不能在王法外调用内部类方法
//        new LocalOuter.LocalInner().inMethod();
    }


}
