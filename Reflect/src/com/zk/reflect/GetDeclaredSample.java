package com.zk.reflect;

import com.zk.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取对象所有成员变量值
 */
public class GetDeclaredSample {
    public static void main(String[] args) {
        try {
            Class<?> employeeClass = Class.forName("com.zk.reflect.entity.Employee");
            Constructor<?> constructor = employeeClass.getConstructor(Integer.class, String.class, Float.class, String.class);
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100, "Jack", 3000f, "研发部"
            });
            // 获取当前类所有成员变量
            Field[] fields = employeeClass.getDeclaredFields();
            for (Field field : fields) {
                if (field.getModifiers() == 1) { // public修饰
                    Object val = field.get(employee);
                    System.out.println(field.getName() + ":" + val);
                } else if (field.getModifiers() == 2) { // private修饰
                    String methodName = "get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);

                    Method method = employeeClass.getMethod(methodName);
                    Object val = method.invoke(employee);
                    System.out.println(field.getName() + ":" + val);
                }
            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
