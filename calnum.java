import java.util.Scanner; //Stepl ให้เรียกใช้คราส Scanner
public class calnum {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);//stpe2 สร้างออบเจ็กต์ in สำหรับรับข้อมูล
        System.out.print("Input Number1 : ");
        x = in.nextInt(); //stpe3 รับตัวเลขเป็นจำนวนเต็มเก็บในตัวแปร x
        System.out.println("your number is "+x);
        System.out.print("Input Number2 : ");
        y = in.nextInt();
        System.out.println("your number2 is "+y);
        System.out.println(x+ " + " +y+ " = " +(x+y));
    }
    
}
