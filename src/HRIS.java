import java.util.Scanner;

public class HRIS {

    String password;
    Scanner scanner;

    HRIS(){
        password = "admin";
        scanner = new Scanner(System.in);
    }

    void run() {
        if(login()){
            mainMenu();
        }else{
            System.out.println("System terminated!");
        }
    }

    void mainMenu(){
        while(true) {
            cleanScreen();
            printMainMenu();
            String input = scanner.next();
            switch (input){
                case "1":
                    System.out.println("You have chosen 1");
                    scanner.next();
                    break;
                case "2":
                    System.out.println("You have chosen 2");
                    scanner.next();
                    break;
                case "3":
                    System.out.println("You have chosen 3");
                    scanner.next();
                    break;
                case "4":
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
        System.out.println("*                 1. Add                                   *");
        System.out.println("*                 2. Delete                                *");
        System.out.println("*                 3. Show all                              *");
        System.out.println("*                 4. Exit                                  *");
        System.out.println("*                                                          *");
        System.out.println("************************************************************");
        System.out.print("Enter the item number: ");
    }

    void printLoginPanel(){
        System.out.println("************************************************************");
        System.out.println("*                                                          *");
        System.out.println("*           Human Resources Information System             *");
        System.out.println("*                       Version 1.0                        *");
        System.out.println("*                                                          *");
        System.out.println("************************************************************");
        System.out.print("Password:");
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

    void cleanScreen() {
        for(int i=0; i<50; ++i){
            System.out.println();
        }
    }
}
