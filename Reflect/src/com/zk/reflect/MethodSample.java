package com.zk.reflect;

import com.zk.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodSample {
    public static void main(String[] args) {
        try {
            Class<?> employeeClass = Class.forName("com.zk.reflect.entity.Employee");
            Constructor<?> constructor = employeeClass.getConstructor(Integer.class, String.class, Float.class, String.class);
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100, "Jack", 3000f, "研发部"
            });
            Method updateSalary = employeeClass.getMethod("updateSalary", Float.class);
            Employee employee1 = (Employee) updateSalary.invoke(employee, 1000f);
            System.out.println(employee1);
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
