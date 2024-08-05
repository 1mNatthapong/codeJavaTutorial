public class ArrayInitia {
    public static void main(String[] args) {
        int [] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int index = 0; index < day.length; index++){
            System.out.println("Month " +(index + 1)+ " has" +day[0]+" days.");
        }
    }
}
