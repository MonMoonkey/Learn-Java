package priv.monkey.learn.java.design_pattern.behavioral.interpreter;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String exp;
        System.out.print("请输入表达式：");
        Scanner scanner = new Scanner(System.in);
        exp = scanner.next();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (char ch : exp.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!hashMap.containsKey(ch)) {
                    System.out.print("请输入" + ch + "的值:");
                    hashMap.put(String.valueOf(ch), scanner.nextInt());
                }
            }
        }
        Calculator calculator = new Calculator(exp);
        System.out.println("运算结果为："+exp
                +"="+calculator.run(hashMap));

    }
}

