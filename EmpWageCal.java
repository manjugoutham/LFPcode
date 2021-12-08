
import java.util.Scanner;
public class EmpWageCal
{
    private String employeeName;
    private int hours;
    private double rate, pay;

    public void setEmployeeName ( String name )
    {
        employeeName = name;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public double calculatePay( int hours, double rate )
    {
        if ( hours > 40 )
        { 
            int extraHours = hours - 40;
            pay = ( 40 * rate ) + ( extraHours * rate );
        }
        else pay = hours * rate;

        return pay;
    }
    public void displayEmployee()
    {
        System.out.printf( "Employee's name: %s", getEmployeeName() );
        System.out.printf( "\nGross Salary: ", + pay );
    }
    
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner( System.in);
        EmpWageCal employee = new EmpWageCal();

        System.out.print( "Enter Employee %s name: " );
        String name = input.nextLine();
        employee.setEmployeeName( name );

        System.out.print( "Enter how many hours worked: " );
        int hours = input.nextInt();

        System.out.print( "Enter hourly rate: " );
        double rate = input.nextInt();

        employee.calculatePay( hours, rate );
        employee.displayEmployee();

        System.out.println();

    }
}
