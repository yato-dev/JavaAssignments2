public class EmployeeWageUC3 {
    public static void main(String[] args){
        double probabRandom=Math.random();
        int EMP_RATE=20;
        int empHour=0;
        int empWage=0;

        if(probabRandom<0.3)
        empHour=8;
        else if(probabRandom<0.6)
        empHour=8;

        empWage=EMP_RATE*empHour;
        System.out.println("Employee Wage is:" +empWage);

    }
}
