public class PassElements {
    public static void main(String[] args) {
        int [ ] numnbers = { 5, 10, 15, 20, 25, 30, 35, 40};
        for (int index = 0; index < numnbers.length; index++){
            showValue(numnbers[index]);
        }
    }
    public static void showValue(int n){
        System.out.print(n+ " ");
    }
}
