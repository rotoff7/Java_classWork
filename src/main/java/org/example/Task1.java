//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
package org.example;

import java.util.Arrays;

public class Task1 {
    public void reversePhrase(String phrase){
        String[] array = phrase.split(" ");
//        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
