package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionLesson2 {
    public static void main(String[] args){
        //аррай лист
        ArrayList<String> people = new ArrayList<>(30); //Лучше указывать хотя бы примерный размер или сколько максимум может быть
        people.ensureCapacity(25); //либо так можно установить размер

        System.out.println(people.size());
        
        //добавление элеменов
        people.add("Tom");
        people.add("SaM");
        people.add("Bob");

        System.out.println(people.size());
        //перегрузка добавления
        people.add(1, "Alice");

        System.out.println(people.size());
        System.out.println(people);

        //добавление списка, вместо одиночного добавления в интерфейс лист
        List<String> name = List.<String>of("TOM","BOB","SAM");

        System.out.println(name);

        //добавление того же самого, но уже в аррай лист
        ArrayList<String> people2 = new ArrayList<String>(List.<String>of("TOM","BOB","SAM"));

        System.out.println(people2.size());
        System.out.println(people2);

        //или же еще можно так
        Collections.addAll(people2, "KATE","dima","vadim");

        System.out.println(people2.size());

        //получени элементов списка people.get(индекс)

        int size_people2 = people2.size() - 1;
        while(size_people2 != -1){
            System.out.println(people2.get(people2.size() - 1 - size_people2));
            size_people2 -= 1;
        }

        System.out.println("");
        //перебор fore-each

        for(String person : people){
            System.out.println(person);
        }

        //замена элемента
        String[] nums = {"one","two","three"};
        for(int i = 0; i < people.size() ; i ++){
            if (i < nums.length) {
                people.set(i, nums[i]);
            }
        }
        System.out.println(people);

        //Индекс элемента

        people.add("two");

        System.out.println(people.indexOf("two"));
        System.out.println(people.lastIndexOf("two"));


        //удаление элемента
        people.remove("two");

        System.out.println(people);
        people.remove("two");
        
        System.out.println(people);

    }
}
