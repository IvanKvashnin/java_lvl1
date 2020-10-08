package ru.java.lvl1;

public class dz2 {


    public static void main(String[] args) {

        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("task1");
        int[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < task1.length; i++) {
            if (task1[i] == 1) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }

        //2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
        System.out.println("task2");
        int[] task2 = new int[8];
        for (int i = 1, j = 0; i < task2.length; i++) task2[i] = j += 3;
        for (int x : task2)
            System.out.println(x + "");
        // я подсмотрел это решение, но так и не понял почему я не могу просто напечатать массив
        // System.out.println(array[i]); без for (int x : task2) ?!

        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
        System.out.println("task3");
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < task3.length; i++) {
            if (task3[i] < 6) {
                task3[i] *= 2;
                System.out.println(task3[i] + " ");

            }
        }

        //4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        //цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("task4");
        int[][] task4 = new int[5][5];
        for (int i = 0; i < task4.length; i++) {
            for (int j = 0; j < task4.length; j++) {
                if (i == j || i + j == 5 - 1) {
                    System.out.print(0);
                } else
                    System.out.print(1);
            }
            System.out.println();

// Подсказали ребята, сам не мог понять что надо делать. После подсказки разобрался.
// На доп задания времени не хватило. Курс дается очень тяжело + не хватка времени. Извините.
        }
    }
}
