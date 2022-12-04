import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
       task1();//Написать программу на Java для вычисления серии чисел Фибоначчи.
        task2();//Создать метод, который преобразует массив объектов User (c полями name, age, phone) в карту Номер телефона -> Имя пользователя.

    }

    private static Map<String, String> map (User [] users) {
        Map<String, String> map = new HashMap<>();
        for (User user : users) {
            map.put(user.getPhoneNumber(), user.getName());
        }
        return map;
    }

    private static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        User user1 = new User("Артем", 20, "89176578970");
        User user2 = new User("Мария", 30, "89276578980");
        User user3 = new User("Андрей", 25, "89376578970");
        User user4 = new User("Петр", 18, "89036578870");
        User user5 = new User("Ольга", 26, "89636568970");

        User[] users = new User[] {user1, user2, user3, user4, user5};
        System.out.println(Arrays.toString(users));
        System.out.println();
        System.out.println(map(users));

    }

    private static void task1() {
        System.out.println("Задание 1");
        System.out.println("Введите число: ");
        // 0,1,1,2,3,5,8...
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long [] fibonachi = new long[(int) n];

        fibonachi [0] = 0;
        fibonachi [1] = 1;
        for (int i = 2; i < fibonachi.length; ++i) {
            fibonachi[i] = fibonachi [i-1] + fibonachi [i-2];
            System.out.println(fibonachi[i]);
        }
    }
}
