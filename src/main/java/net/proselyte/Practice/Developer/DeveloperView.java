package main.java.net.proselyte.Practice.Developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeveloperView {

    public void consoleView() {

        DeveloperController developerController = new DeveloperController();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Integer developerId = null;
        String developerName = null;
        String developerSurname = null;
        String developerSpecialization = null;
        Integer developerExperience = null;
        Integer developerSalary = null;
        Developer developer;

        try {
            do {
                System.out.println("Choose, what do you want to do: ");
                System.out.println("    1. Create developer");
                System.out.println("    2. Update developer");
                System.out.println("    3. Find developer by id");
                System.out.println("    4. Remove developer");
                System.out.println("    5. Exit");
                System.out.println();

                str = br.readLine().trim();

                switch(str) {
                    case "1": // Create developer
                            // Enter developer ID
                            do {
                                System.out.println("Enter developer's ID:");
                                developerId = Integer.parseInt(br.readLine().trim());
                                break;
                            } while (true);

                            // Enter developer name
                            do {
                                System.out.println("Enter developer's name:");
                                developerName = br.readLine().trim();
                                break;
                            } while (true);

                            // Enter developer Surname
                            System.out.println("Enter developer's surname:");
                            do {
                                developerSurname = br.readLine().trim();
                                break;
                            } while (true);

                            // Enter developer specialization
                            System.out.println("Enter developer's specialization:");
                            do {
                                developerSpecialization = br.readLine().trim();
                                break;
                            } while (true);

                            // Enter developer experience
                            System.out.println("Enter developer's experience:");
                            do {
                                developerExperience = Integer.parseInt(br.readLine().trim());
                                break;
                            } while (true);

                            // Enter developer salary
                            System.out.println("Enter developer's salary:");
                            do {
                                developerSalary = Integer.parseInt(br.readLine().trim());
                                break;
                            } while (true);
                            System.out.println();

                        developer = new Developer(developerId, developerName, developerSurname, developerSpecialization, developerExperience, developerSalary);
                        developerController.save(developer);
                        System.out.println("Developer created!");
                        System.out.println();
                        break;


                    case "2": // Update developer
                        String input;
                        do {
                            System.out.println("What do you want to update?");
                            System.out.println("    1. Id");
                            System.out.println("    2. Name");
                            System.out.println("    3. Surname");
                            System.out.println("    4. Specialization");
                            System.out.println("    5. Experience");
                            System.out.println("    6. Salary");
                            input = br.readLine().trim();
                            switch(input) {
                                case "1":
                                    do {
                                        System.out.println("Change developer's ID:");
                                        developerId = Integer.parseInt(br.readLine().trim());
                                        break;
                                    } while (true);
                                    break;
                                case "2":
                                    do {
                                        System.out.println("Enter developer's name: ");
                                        developerName = br.readLine().trim();
                                        break;
                                    } while (true);
                                    break;
                                case "3":
                                    do {
                                        System.out.println("Enter developer's surname: ");
                                        developerSurname = br.readLine().trim();
                                        break;
                                    } while (true);
                                    break;
                                case "4":
                                    do {
                                        System.out.println("Enter developer's specialization: ");
                                        developerSpecialization = br.readLine().trim();
                                        break;
                                    } while (true);
                                    break;
                                case "5":
                                    do {
                                        System.out.println("Enter developer's experience: ");
                                        developerExperience = Integer.parseInt(br.readLine().trim());
                                        break;
                                    } while (true);
                                    break;
                                case "6":
                                    do {
                                        System.out.println("Enter developer's salary: ");
                                        developerSalary = Integer.parseInt(br.readLine().trim());
                                        break;
                                    } while (true);
                                    break;
                            }
                            System.out.println();
                            break;
                        } while(!input.equals("exit"));
                        developer = new Developer(developerId, developerName, developerSurname, developerSpecialization, developerExperience, developerSalary);
                        developerController.save(developer);
                        System.out.println("Developer updated!");
                        System.out.println();
                        break;


                    case "3": // Find developer by id
                        System.out.println("Enter id or 'exit' to return to main menu:");
                            do {
                                String id;
                                id = br.readLine().trim();
                                if (!id.equals("exit"))
                                    developerController.getById(Integer.parseInt(id));
                                else {
                                    System.out.println("Returning to main menu...");
                                    break;
                                }
                            } while (true);
                        System.out.println();
                        break;


                    case "4": // Remove developer
                        System.out.println("Enter id or 'exit' to return to main menu:");
                        do {
                            String id;
                            id = br.readLine().trim();
                            if (!id.equals("exit"))
                                developerController.remove(Integer.parseInt(id));
                            else {
                                System.out.println("Returning to main menu...");
                                break;
                            }
                        } while (true);
                        System.out.println();
                        break;


                    case "5": // Exit
                        System.out.println("You chose: 5. Exit.");
                        System.out.println();
                        break;
                }


            } while(!str.equals("5"));


        } catch(IOException e) {
            System.out.println("Ooooops... Some error happened: " + e);
        }
    }
}