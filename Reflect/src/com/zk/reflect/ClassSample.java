package com.zk.reflect;

import com.zk.reflect.entity.Employee;

public class ClassSample {
    public static void main(String[] args) {
        try {
            // Class.forName() 方法将指定的类加载到JVM, 并返回对应Class对象
            Class<?> employeeClass = Class.forName("com.zk.reflect.entity.Employee");
            System.out.println("Employee已被加载到jvm");
            // newInstance() 通过默认构造方法创建新的对象
            Employee employee = (Employee) employeeClass.newInstance();
            System.out.println(employee);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // 非法访问异常, 当在作用域外访问对象方法或成员变量时抛出
            e.printStackTrace();
        } catch (InstantiationException e) {
            // 对象无法被实例化, 抛出"实例化异常", 例如抽象类
            e.printStackTrace();
        }
    }
}
