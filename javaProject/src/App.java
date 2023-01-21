import java.util.Scanner;

//Задание 1
public class App {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число N для расчета 1+ ... + N");
        int N = iScanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("Введите число M для расчета 1* ... * M");
        int M = iScanner.nextInt();
        int pr = 1;
        for (int i = 1; i <= M; i++) {
            pr = pr * i;
        }
        System.out.println(pr);
    }
}

// Задание 2
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(1);
        for (int i = 1; i <= 1000; i++) {
            for (int j = i - 1; j >= 1; j--) {
                if (j == 1)
                    System.out.println(i);
                if (i % j == 0)
                    break;
                if (i % j != 0)
                    continue;
            }
        }
    }
}

// Задание 3
public class App {
    /**
     * @param args
     * @throws Exception
     */

    static int sum(int a, int b) {
        return a + b;
    }

    static int raz(int a, int b) {
        return a - b;
    }

    static int pr(int a, int b) {
        return a * b;
    }

    static int del(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) throws Exception {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = iScanner.nextInt();
        System.out.println("Введите второе число");
        int b = iScanner.nextInt();
        System.out.println("Выберите арифметическую операцию: сложение +, вычитание -, умножение *, деление /");
        String op = iScanner.next();

        switch (op) {
            case "+":
                System.out.println(sum(a, b));
                break;
            case "-":
                System.out.println(raz(a, b));
                break;
            case "/":
                System.out.println(del(a, b));
                break;
            case "*":
                System.out.println(pr(a, b));
                break;
        }

    }
}
