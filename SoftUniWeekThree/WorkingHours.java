package SoftUniWeekThree;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (hour >= 10 && hour <= 18){

            switch (dayOfWeek){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                case "Sunday":
                default:
                    System.out.println("closed");
                    break;
            }

        }else {
            System.out.println("closed");
        }

    }
}
