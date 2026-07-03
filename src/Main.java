public class Main {
    public static void main(String[] args) {

        // Задача 1
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirdArray = {4, 7, 10, 13};

        // Задача 2
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i < secondArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i < thirdArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 3
        StringBuilder reversedFirst = new StringBuilder();
        for (int i = firstArray.length - 1; i >= 0; i--) {
            reversedFirst.append(firstArray[i]);
            if (i > 0) {
                reversedFirst.append(", ");
            }
        }
        System.out.println(reversedFirst.toString());

        StringBuilder reversedSecond = new StringBuilder();
        for (int i = secondArray.length - 1; i >= 0; i--) {
            reversedSecond.append(secondArray[i]);
            if (i > 0) {
                reversedSecond.append(", ");
            }
        }
        System.out.println(reversedSecond.toString());

        StringBuilder reversedThird = new StringBuilder();
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            reversedThird.append(thirdArray[i]);
            if (i > 0) {
                reversedThird.append(", ");
            }
        }
        System.out.println(reversedThird.toString());
        // Задача 4

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
