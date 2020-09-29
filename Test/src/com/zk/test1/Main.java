package com.zk.test1;

public class Main {
    public static void main(String[] args) {
        Child child  = new Child("Jack");
        child.setTutor(new Teacher());
        child.study();







//        Circle circle = new Circle(10);
//        circle.show();
//
//        Rectangle rectangle = new Rectangle(10, 20);
//        rectangle.show();
//        circle.getArea();
//        circle.getGirth();






//        com.zk.Student student = new com.zk.Student();
//        Rocket r1 = Rocket.getInstance();
//        final int age;
//        age = 30;
//        Person person = new Person();
//        Hand hand = person.new Hand();
//        Person.Car car = new Person.Car();
//        com.zk.Student.test1();



//        int[] array = {11, 22, 33, 44};
//        short index = 3;
//        array[index] = 20;
//        int[] arr1;
//        int[] arr2 = {};
//        int arr3[] = {};
//        int[] arr4 = new int[]{1, 2, 3, 4};
//        // 语法糖, 是上面的简化写法
//        int[] arr5 = {1, 2, 3, 4};
//        int[] arr6 = new int[4];
//        arr6[0] = 1;
//        arr6[1] = 2;
//        arr6[2] = 3;
//        arr6[3] = 4;

//        for (int i = 0; i < arr6.length; i++) {
//            System.out.println(arr6[i]);
//        }
//
//        for (int ele : arr6) {
//            System.out.println(ele);
//        }

//        System.out.println(sum(new int[] {10, 20, 30, 40}));
//        System.out.println(sum2(10, 20, 30, 40));

    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int sum2(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }
}
