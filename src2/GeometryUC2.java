public class GeometryUC2 {
    public static void main(String[] args){
        int x1,y1,x2,y2,x3,y3,x4,y4;
        Scanner scanner=new Scanner(System.in);

        x1=scanner.nextInt();
        y1=scanner.nextInt();
        x2=scanner.nextInt();
        y2=scanner.nextInt();
        x3=scanner.nextInt();
        y3=scanner.nextInt();
        x4=scanner.nextInt();
        y4=scanner.nextInt();


        double length=0;
        length=Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        double length2=0;
        length2=Math.sqrt( Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));

        if(length==length2)
        System.out.println("Lines are equal" );
        else
        System.out.println("Lines are not equal");



     
        scanner.close();
    }
}
