public class EmployeeWageUC6 {
    public static void main(String[] args){
        final int NO_OF_DAYS=20;
        final int EMP_RATE=20;
        int empWage=0;
        int empHour=0;
        int totalEmpWage=0;
        final int partTime=1;
        final int fullTime=2;
        int totalHours=0;

        for(int i=1;i<=NO_OF_DAYS;i++)
        {
            if(totalHours>=100)
            break;
            int probabRandom=(int) (Math.random()*10)%3;

            switch(probabRandom){
                case  partTime:{
                    empHour=8;
                    break;
                }
                case fullTime:{
                    empHour=8;
                    break;
                }
                default:{
                    empHour=0;
                }
                totalHours+=empHour;
                empWage=empHour*EMP_RATE;
                totalEmpWage+=empWage;
            }
        }

        System.out.println("Total Employee Wage is" +totalEmpWage);

      
    }
}
