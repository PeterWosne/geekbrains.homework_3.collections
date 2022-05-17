package geekbrains.homework_3.collections;

import java.util.*;

public class Main {
    private static final String vCards = "RTX3050,RTX3060,GTX1050,RTX3060,RTX3050,RTX3050Ti,RTX3070,RTX3060,RTX2060,GTX1650,RTX3060,RX5600,RTX3060,GTX1050,GTX1650,RX5600";

    public static void main(String[] args) {
	// write your code here
        //Задача#1
        printInfo(calcWords(makeArray(vCards)));
        //Задача#2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("peter", "+79775961701");
        phoneBook.add("natalia", "+79151707115");
        phoneBook.add("peter", "+79775961702");
        phoneBook.add("natalia", "+ХХХХХХХХХХХ");
        System.out.println(phoneBook.get("peter"));
        System.out.println(phoneBook.get("natalia"));
    }

    public static void printInfo(HashMap<String, Integer> map) {
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Integer num = map.get(key);
            System.out.println(key + ": " + num);
        }
    }

    public static HashMap<String, Integer> calcWords(String[] array) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : array) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static String[] makeArray(String string) {return string.split(",");}
}
