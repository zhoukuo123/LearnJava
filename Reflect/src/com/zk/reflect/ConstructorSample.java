package com.zk.reflect;

import com.zk.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用带参构造方法创建对象
 */
public class ConstructorSample {
    public static void main(String[] args) {
        try {
            Class<?> employeeClass = Class.forName("com.zk.reflect.entity.Employee");
            Constructor<?> constructor = employeeClass.getConstructor(Integer.class, String.class, Float.class, String.class);
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100, "Jack", 3000f, "研发部"
            });
            System.out.println(employee);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // 当被调用的方法的内部抛出了异常而没有被捕获时
            e.printStackTrace();
        }
    }
}
