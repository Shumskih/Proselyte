package main.java.net.proselyte.chapter18;

// Демострация применения списка свойств
import java.util.*;

class PropDemo {
    public static void main (String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        // Получаем множество ключей
        Set<?> states = capitals.keySet();

        // Показываем все штаты и их столицы
        for (Object name : states)
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name) + ".");
        System.out.println();

        // Находим штат, отсутствующий в списке, указав значения, выбираемые по умолчанию
        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица штата Флорида " + str + ".");
    }
}
