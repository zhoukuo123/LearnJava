package com.zk;

public class Main {
    public static void main(String[] args) {
        System.out.println(validate("z4334"));
    }

    public static boolean validate(String email) {
        if (email == null) {
            System.out.println("不能为空");
            return false;
        }
        char[] chars = email.toCharArray();
        if (chars.length < 6 || chars.length > 18) {
            System.out.println("必须6-18个字符");
            return false;
        }
        if (!isLetter(chars[0])) {
            System.out.println("必须以字母开头");
            return false;
        }

        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (isLetter(c) || isDigit(c) || c == '_') continue;
            System.out.println("必须由字母, 数字, 下划线组成");
            return false;
        }
        return true;
    }

    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
