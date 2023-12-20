package src;

public class EmployeeWageUC2 {

    public static void main(String[] args)
    {
        int EMP_RATE=20;
        double probabRandom=Math.random();
        int empHours=0;

        if(probabRandom<0.5)
        {
            empHours=8;
        }
        int empWage=empHours*EMP_RATE;
        System.out.println("Employee Wage:" +empWage);
    }
    
}
