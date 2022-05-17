package geekbrains.homework_3.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> map = new HashMap<>();

    public void add(String name, String phone) {
        ArrayList<String> phones = getPhones(name);
        phones.add(phone);
    }

    public ArrayList<String> getPhones(String name) {
        return map.computeIfAbsent(name, key -> new ArrayList<>());
    }

    public ArrayList<String> get(String name) {return getPhones(name);}
}
