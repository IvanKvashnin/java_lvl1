package ru.java.lvl1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class dz1 {
    public static void main(String[] args) {
        System.out.println(task3(1, 1, 1, 1));
        System.out.println(task4(10, 20));
        task5(10);
        System.out.println(task6(-1));
        task7("geekBrains");

    }

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    byte b = 100;
    short s = 500;
    int i = 1000;
    long l = 200000L;
    float f = 3.14f;
    double d = -127.127;
    char c = '*';
    boolean bool = true;
    String str = "Hello!";

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;

    public static int task3(int a, int b, int c, int d) {
        return a * (b + (c / d));

    }




    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
    // от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    public static boolean task4(int x, int y) {
        if (x >= 10 || y <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен
    // напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void task5(int a) {
        if (a >= 10) {
            System.out.println(a + " положительное");
        } else {
            System.out.println(a + " отрицательное");
        }
    }

    //6.Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число
    // отрицательное;
    public static boolean task6(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //7.Написать метод, которому в качестве параметра передается
    // строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!

    public static void task7 (String name){
        System.out.println("Привет " + name);
    }
}