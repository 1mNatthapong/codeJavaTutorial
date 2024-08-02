public class TestOver1 {
    public static int add(){
        return 0;
    }
    public static int add(int x){
        return x;
    }
    public static int add(int x, int y){
        return x + y;
    }
    public static int add(int x, int y, int z){
            return x + y + z;
    }
    public static void main(String[] args) {
        System.out.println("Sum = " +add());
        System.out.println("Sum = " +add(3));
        System.out.println("Sum = " +add(2, 2));
        System.out.println("Sum = " +add(2, 2, 2));
    }
}
/*public class calGrade {
    public static char calculaye(int score){
        char grade;
        if ((score >= 80) && (score <= 100)) {
            grade = 'A';
        }else if ((score >= 70) && (score < 80)) {
            grade = 'B';
        }else if ((score >= 60) && (score < 70)) {
            grade = 'C';
        }else if ((score >= 50) && (score < 60)) {
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
    }
    public static void main(String[] args) {
        System.out.println("Grade = : " +calculaye(75));
    }
        
}
*/
