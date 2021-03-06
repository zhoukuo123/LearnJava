package com.zk.reflect;

import com.zk.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldSample {
    public static void main(String[] args) {
        try {
            Class<?> employeeClass = Class.forName("com.zk.reflect.entity.Employee");
            Constructor<?> constructor = employeeClass.getConstructor(Integer.class, String.class, Float.class, String.class);
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100, "Jack", 3000f, "研发部"
            });
            Field enameField = employeeClass.getField("ename");
            String ename = (String) enameField.get(employee);
            System.out.println(ename);

            enameField.set(employee, "rose");
            System.out.println(employee.getEname());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // field 没有访问权限, 或没有该field
            e.printStackTrace();
        }
    }
}
