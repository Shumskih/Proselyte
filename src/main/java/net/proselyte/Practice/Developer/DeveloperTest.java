package main.java.net.proselyte.Practice.Developer;


public class DeveloperTest {
    public static void main(String args[]) {

        DeveloperDAO workingWithFile = new DeveloperDAO();

        Developer ivan = new Developer(1, "Ivan", "Ivanov", "Java Developer", 3, 3000);

        workingWithFile.save(ivan);
    }
}
