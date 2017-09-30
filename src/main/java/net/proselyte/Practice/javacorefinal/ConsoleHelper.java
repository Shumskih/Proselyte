package main.java.net.proselyte.Practice.javacorefinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public void consoleHelper() {
        DeveloperView developerView = new DeveloperView();
        CompanyView companyView = new CompanyView();
        CustomerView customerView = new CustomerView();
        ProjectView projectView = new ProjectView();
        SkillView skillView = new SkillView();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        try {
            do {
                System.out.println("Choose, what do you want to do: ");
                System.out.println("    Create: ");
                System.out.println("            1. Skill");
                System.out.println("            2. Project");
                System.out.println("            3. Developer");
                System.out.println("            4. Company");
                System.out.println("            5. Customer");
                System.out.println("-----------------------");
                System.out.println("    Update: ");
                System.out.println("            6. Skill");
                System.out.println("            7. Project");
                System.out.println("            8. Developer");
                System.out.println("            9. Company");
                System.out.println("            10. Customer");
                System.out.println("-----------------------");
                System.out.println("    Find by ID: ");
                System.out.println("            11. Skill");
                System.out.println("            12. Project");
                System.out.println("            13. Developer");
                System.out.println("            14. Company");
                System.out.println("            15. Customer");
                System.out.println("-----------------------");
                System.out.println("    Show all: ");
                System.out.println("            16. Skills");
                System.out.println("            17. Projects");
                System.out.println("            18. Developer");
                System.out.println("            19. Companies");
                System.out.println("            20. Customers");
                System.out.println("-----------------------");
                System.out.println("    Exit: ");
                System.out.println("            21. Exit");
                System.out.println();

                str = br.readLine().trim();

                switch(str) {
                    case "1":
                        skillView.createSkill();
                        break;
                    case "2":
                        projectView.createProject();
                        break;
                    case "3":
                        developerView.createDeveloper();
                        break;
                    case "4":
                        companyView.createCompany();
                        break;
                    case "5":
                        customerView.createCustomer();
                        break;
                    case "6":
                        skillView.updateSkill();
                        break;
                    case "7":
                        projectView.updateProject();
                        break;
                    case "8":
                        developerView.updateDeveloper();
                        break;
                    case "9":
                        companyView.updateCompany();
                        break;
                    case "10":
                        customerView.updateCustomer();
                        break;
                    case "11":
                        skillView.getById();
                        break;
                    case "12":
                        projectView.getById();
                        break;
                    case "13":
                        developerView.getById();
                        break;
                    case "14":
                        companyView.getById();
                        break;
                    case "15":
                        customerView.getById();
                        break;
                    case "16":
                        skillView.showAllSkills();
                        break;
                    case "17":
                        projectView.showAllProjects();
                        break;
                    case "18":
                        developerView.showAllDevelopers();
                        break;
                    case "19":
                        companyView.showAllCompanies();
                        break;
                    case "20":
                        customerView.showAllCustomers();
                        break;
                    }
            } while (!str.equals("21"));
        } catch (IOException e) {
            System.out.println("Ooooops... Some error happened: " + e);
        }
    }
}