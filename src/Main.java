import java.util.Scanner;
public class Main {
    public static void function1() {
        System.out.println("exit");
    }
    public static String function2() {
        return "exit";
    }
    public static void main(String[] args) {
        // Оператор ветвления break
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int n = 0; // счётчик
        int input = scanner.nextInt();
        while (i * i <= input) {
            System.out.println(i*i);
            if (n == input) {
                // обрываем цикл по условию и перешли к функциии function1()
                function1();
                break;
            }
            n++; // счётчик
            i++;
        }
        // инициализировали переменную secondFunction функцией function2() и вывели на консоль
        String secondFunction = function2();
        System.out.println(secondFunction);





        /*int u = 0;
        while(u < 10) {
            if( u == 5) {
                continue;
            }
            System.out.println(u);
            u++;

        }*/
    }
}