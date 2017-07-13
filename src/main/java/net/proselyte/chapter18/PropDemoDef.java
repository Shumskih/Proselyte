package main.java.net.proselyte.chapter18;

// Используем список свойств по умолчанию
import java.util.*;

class PropDemoDef {
    public static void main (String[] args) {
        Properties defList = new Properties();
        defList.put("Флорида", "Тэлесси");
        defList.put("Висконсин", "Мэдисон");
        Properties capitals = new Properties(defList);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олинмпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        // Получаем множество ключей
        Set<?> states = capitals.keySet();

        // Выводим все штаты и их столицы
        for (Object name : states)
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String)name) + ".");
        System.out.println();

        // Теперь штат Флорида бужет найден в списке по умолчанию
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица Флориды - " + str + ".");
    }
}