import java.util.Arrays;

public class Main {

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sumMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMonth += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей");
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        int maxMoneyMonth = 0;
        int minMoneyMonth = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (maxMoneyMonth < arr[i]) {
                maxMoneyMonth = arr[i];
            }
            if (minMoneyMonth > arr[i]) {
                minMoneyMonth = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMoneyMonth + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxMoneyMonth + " рублей.");
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        float mediumMoneyMonth = (float) sumMonth / (float) arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumMoneyMonth + " рублей.");
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}