package main.java.net.proselyte.patterns.behavioral.iterator;

public class ConcreteAgregate implements Aggregate{
    private String name;
    String[] tasks;

    public ConcreteAgregate(String name, String[] tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements  Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
