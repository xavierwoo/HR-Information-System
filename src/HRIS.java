import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class HRIS {

    String password;
    Scanner scanner;
    Employee[] employees;
    int numberOfEmployees;

    HRIS(){
        password = "admin";
        scanner = new Scanner(System.in);
        employees = new Employee[100];
        numberOfEmployees = 0;
    }

    boolean login() {
        while(true) {
            cleanScreen();
            printLoginPanel();
            String input = scanner.next();
            if (password.equals(input)) {
                return true;
            }else if(input.equals("bye")){
                return false;
            }
        }
    }

    void run() {
        if(login()){
            mainMenu();
        }else{
            System.out.println("System terminated!");
        }
    }

    /*Code for the 1st lesson*/

    void printLoginPanel(){
        System.out.println("************************************************************");
        System.out.println("*                                                          *");
        System.out.println("*           Human Resources Information System             *");
        System.out.println("*                       Version 1.0                        *");
        System.out.println("*                                                          *");
        System.out.println("************************************************************");
        System.out.print("Password:");
    }

    void cleanScreen() {
        for(int i=0; i<50; ++i){
            System.out.println();
        }
    }

    /*Code for the 2nd lesson*/

    void mainMenu(){
        while(true) {
            cleanScreen();
            printMainMenu();
            String input = scanner.next();
            switch (input){
                case "1":
                    showAll();
                    break;
                case "2":
                    addEmployee();
                    break;
                case "3":
                    System.out.println("You have chosen 3");
                    scanner.next();
                    break;
                case "e":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Your choice doesn't exist!");
                    scanner.next();
            }
        }
    }

    void printMainMenu(){
        System.out.println("************************************************************");
        System.out.println("*                                                          *");
        System.out.println("*                         MENU                             *");
        System.out.println("*                 1. Show all employees                    *");
        System.out.println("*                 2. Add                                   *");
        System.out.println("*                 3. Delete                                *");
        System.out.println("*                 e. Exit                                  *");
        System.out.println("*                                                          *");
        System.out.println("************************************************************");
        System.out.print("Enter the item number: ");
    }

    void addEmployee(){
        System.out.println("Enter id:");
        int id = Integer.parseInt(scanner.next());
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter gender");
        String gender = scanner.next();
        System.out.println("Enter age");
        int age = Integer.parseInt(scanner.next());
        System.out.println("Enter salary");
        int salary = Integer.parseInt(scanner.next());

        Employee newEmployee = new Employee();
        newEmployee.id = id;
        newEmployee.name = name;
        newEmployee.gender = gender;
        newEmployee.age = age;
        newEmployee.salary = salary;

        employees[numberOfEmployees] = newEmployee;
        ++numberOfEmployees;
    }

    void showAll(){
        cleanScreen();
        System.out.println("id\tname\tgender\tage\tsalary");

        for(int i=0; i<numberOfEmployees; ++i){
            System.out.print(employees[i].id);
            System.out.print("\t");
            System.out.print(employees[i].name);
            System.out.print("\t");
            System.out.print(employees[i].gender);
            System.out.print("\t");
            System.out.print(employees[i].age);
            System.out.print("\t");
            System.out.println(employees[i].salary);
        }

        System.out.println("Enter anything to return.");
        scanner.next();
    }
}
