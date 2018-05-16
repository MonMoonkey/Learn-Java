package priv.monkey.learn.java.reflection;

import priv.monkey.learn.java.annotation.MonkeyAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Class reflection = null;
        try {
//            1. Class reflection = Reflection.class;
//            2. Reflection r = new Reflection("name");
//               Class c = r.getClass();
            //3. 通过名字获得类，比较灵活，重点掌握
            reflection = Class.forName("priv.monkey.learn.java.reflection.Reflection");
            //可以实例化，只能通过无参public默认构造函数，如果默认无参构造函数被设为private则会报错
//            Object o = reflection.newInstance();
            //可以直接cast，但是问题如上，默认构造函数为private，所以会报错
            Reflection r = (Reflection) reflection.newInstance();

//            System.out.println(Class.forName("priv.monkey.learn.design_pattern.Main").newInstance().s);


//            constructorReflect(reflection);


            fieldReflect(reflection,r);

            methodReflect(reflection, r);

            annotationReflect(reflection);

            Class[] face = reflection.getInterfaces();
            for (Class c : face) {
                System.out.println(c.getName());
            }


        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void annotationReflect(Class reflection) throws NoSuchMethodException, ClassNotFoundException {
        Annotation[] annotations;
        annotations= reflection.getAnnotations();
//            for (Annotation a : annotations) {
//                System.out.println(a.toString());
//            }
        Method im = reflection.getDeclaredMethod("pleaseImplement", null);
        annotations = im.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a.toString());
        }
        MonkeyAnnotation annotation = (MonkeyAnnotation) reflection.getAnnotation(Class.forName("priv.monkey.learn.java.annotation.MonkeyAnnotation"));
        System.out.println(annotation.name());
    }

    private static void methodReflect(Class reflection, Reflection r) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method[] methods ;
        methods= reflection.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        System.out.println("================================================");
        methods=reflection.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Method m;
        m= reflection.getDeclaredMethod("pubMethod", null);
        m.invoke(r, null);

        m = reflection.getDeclaredMethod("pubMethod", String.class,int.class);
        Class returntype=m.getReturnType();
        System.out.println(returntype.getName());
        Object oj= m.invoke(r, "nihao",1000);
        System.out.println(oj);
    }

    private static void fieldReflect(Class reflection,Object o) throws NoSuchFieldException, IllegalAccessException {
        Field[] fields;
        //只能达到public属性
        fields = reflection.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        //得到全部属性
        fields = reflection.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Field field = reflection.getDeclaredField("name");
        //读取private的属性，方法必须先这样一下
        field.setAccessible(true);
        String name = (String) field.get(o);
        System.out.println(name);
        field.set(o, "kobe bryant");
        System.out.println(field.get(o));
    }

    private static void constructorReflect(Class reflection) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //getConstructors() 返回public构造函数
        Constructor<?>[] constructors = reflection.getConstructors();
/*            for (Constructor c : constructors) {
                System.out.println(c.getName()+" "+c.getModifiers()+" "+c.getParameterCount()+" "+c.getParameterTypes().toString());
                for (Class c1 : c.getParameterTypes()) {
                    System.out.println(c1.getName());
                }
            }*/

        //getDeclaredConstructors()返回所有构造函数
        constructors = reflection.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c.getName()+" "+c.getModifiers()+" "+c.getParameterCount());
            System.out.print("构造函数的参数类型: ");
            for (Class c1 : c.getParameterTypes()) {
                System.out.print(c1.getName()+" ");
            }
            System.out.println();
        }


        Constructor constructor;
        Class[] classes = new Class[]{String.class, int.class};
        constructor= reflection.getConstructor(classes);
        Reflection rr;
        rr= (Reflection) constructor.newInstance("nihao", 5);
        constructor= reflection.getConstructor(int.class,String.class );
        rr = (Reflection) constructor.newInstance(7, "xixi");

    }
}
