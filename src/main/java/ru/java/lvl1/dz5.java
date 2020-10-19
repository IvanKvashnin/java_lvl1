package ru.java.lvl1;

import java.lang.reflect.Array;

public class dz5 {
    public static void main(String[] args) {
        Employer employer = new Employer("Ivan", "QA", "mail@mail.ru", 89995551122L,
                1000, 25);
        employer.info();

        Employer[] employers = new Employer[5];
        employers[0] = new Employer("Ivan", "QA", "mail@mail.ru", 89995551122L, 1000, 25);
        employers[1] = new Employer("Petr", "QA", "mail@mail.ru", 89999999999L, 1000, 35);
        employers[2] = new Employer("Nikita", "QA", "mail@mail.ru", 8111111111L, 1000, 40);
        employers[3] = new Employer("Aleksandr", "QA", "mail@mail.ru", 8555555555L, 1000, 41);
        employers[4] = new Employer("Aleksey", "QA", "mail@mail.ru", 8777777777L, 1000, 50);
        for (int i = 0; i < employers.length; i++) {

            employers[i].info();

        }

        countAge(employers);


    }

    private static void countAge(Employer[] employers) {
        for (int i = 0; i < employers.length; i++) {
            if (employers[i].getAge() > 40){
                System.out.println("Соторудник старше 40 лет");
                employers[i].info();

        }

    }
    }
}

class Employer {
    private String name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Employer(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info () {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }

    public int getAge() {
        return age;
    }

}




