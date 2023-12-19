public class EmployeeWageUC4 {

    public static void main(String[] args){

        int probabRandom=(int) (Math.random()*10)%3;
        int EMP_RATE=20;
        int empHour=0;
         final int partTime=1;
        final int fullTime=2;


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
        }

        int empWage=empHour*EMP_RATE;
        System.out.println("Employee Wage is" +empWage);

    }
    
}
