package main.java.net.proselyte.patterns.behavioral.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        String[] tasks = {"to build a house", "to bring up a son", "to plant a tree"};

        ConcreteAgregate c = new ConcreteAgregate("Aleskander Shumeiko", tasks);
        Iterator it = c.getIterator();

        System.out.print(c.getName() + "'s ");
        System.out.println("tasks: ");

        while(it.hasNext())
            System.out.println(it.next().toString() + " ");
    }
}
