package mid1.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {
        //Class 조회
        Class  clazz = String.class; // 1. 클래스에서 조회
        Class clazz1 = new String().getClass();
        Class clazz2 = Class.forName("java.lang.String");

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("field = " + declaredField.getType() + " " + declaredField.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("superClass: " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("Interface: " + anInterface.getName());
        }
    }
}
