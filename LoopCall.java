public class LoopCall {
    public static void main(String[] args) {
        System.out.println("Hello from main method. ");
        for(int i = 1; i <= 5; i++){
            displayMessage();
        }
        System.out.println("back in the main meyhod.");
    }
    public static void displayMessage(){
        System.out.println("Hello grom the displayMessage");
    }
}
