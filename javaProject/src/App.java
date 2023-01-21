import java.util.Scanner;

// //Задание 1
// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Введите число N для расчета 1+ ... + N");
//         int N = iScanner.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= N; i++) {
//             sum = sum + i;
//         }
//         System.out.println(sum);

//         System.out.println("Введите число M для расчета 1* ... * M");
//         int M = iScanner.nextInt();
//         int pr = 1;
//         for (int i = 1; i <= M; i++) {
//             pr = pr * i;
//         }
//         System.out.println(pr);

//     }
// }

// //Задание 2
// public class App {
//     /**
//      * @param args
//      * @throws Exception
//      */
//     public static void main(String[] args) throws Exception {

//         for (int i = 1; i <= 1000; i++) {
//             for (int j = i - 1; j >= 1; j--) {
//                 if (j == 1)
//                     System.out.println(i);
//                 if (i % j == 0)
//                     break;
//                 if (i % j != 0)
//                     continue;
//             }

//         }

//     }
// }

//Задание 3
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

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
