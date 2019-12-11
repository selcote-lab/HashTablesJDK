package com.tonasolution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee zouhaire = new Employee("zouhaire", "elakioui", 123);
        Employee jack = new Employee("jack", "ali", 1234);
        Employee kali = new Employee("kali", "maeckel", 12345);
        Employee mary = new Employee("Mary", "smith", 12345);
        Employee kamal = new Employee("kamal", "loli", 12395);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jack", jack);
        hashMap.put("Zouhaire", zouhaire);
        hashMap.put("Kali", kali);
        hashMap.put("Mary", mary);

        Employee employee = hashMap.putIfAbsent("Mary", kamal);
        System.out.println(employee);

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(jack));

        System.out.println(hashMap.getOrDefault("none", zouhaire));
        System.out.println(hashMap.remove("Mary"));
        
//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        hashMap.forEach(
                (k, v) -> System.out.println("Key = "+ k + ", Employee = " + v)
        );


    }
}
