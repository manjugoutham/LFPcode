
import java.util.Scanner;

public class EmpWageUC2 {

    public static void main(String[] args) {

        System.out.print("Enter number of hours worked: ");
        Scanner sc = new Scanner(System.in);
        double totalHoursWorked = sc.nextInt();
        double standardWage = 20;
        int standardHours = 40;
        double totalWage;

        if (totalHoursWorked < 40)
            totalWage = standardWage * totalHoursWorked;
        else
            totalWage = standardWage * standardHours;

        System.out.println("Your total salary of the week: " + totalWage);
    }
}
