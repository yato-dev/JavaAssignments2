import java.util.Scanner;

public class GeometryUC1 {

    public static void main(String[] args){
        int x1,y1,x2,y2;
        Scanner scanner=new Scanner(System.in);

        x1=scanner.nextInt();
        y1=scanner.nextInt();
        x2=scanner.nextInt();
        y2=scanner.nextInt();

        double length=0;
        length=Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println("Length of Coordinate is" + length);
        scanner.close();

    }
    
}
