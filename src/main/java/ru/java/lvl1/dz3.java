package ru.java.lvl1;

public class dz3 {

    public static void main(String[] args) {
        String s = "Предложение один     Теперь предложение   два   Предложение три  ";
        String s1 = s.replaceAll("  +", " ");
        StringBuilder s2 = new StringBuilder(s1);
        for (int i = s2.length()-1; i >= 0; i--) {
            if (s2.charAt(i) >= 'А' && s2.charAt(i) <= 'Я') {
                s2.setCharAt(i - 1, '.');
                s2.setCharAt(i, ' ');


            }
        }
        s2.delete(0,2);
        s2.append('.');
        System.out.println(s2.toString());

    }
}



