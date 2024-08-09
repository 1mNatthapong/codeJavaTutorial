public class LibraryCard {
    private Student owner;//ประกาศออบเจ็กต์ owenr ซึ่งอยู่ในคราส Student
    private int borrowcnt;
    public LibraryCard(){
        owner = null;
        borrowcnt = 0;
    }
    public void checkOut(int numOfBook){
        borrowcnt = borrowcnt + numOfBook;
    }
    public void setOwenrName(Student student){ 
        //เมธอดกำหนดผู้ยืม โดยจะรับข้อมูล
        owner = student;
    }
    public int getNuberOfBooks(){
        return borrowcnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
        return "Owner Name: " +owner.getName() +"\n"+"Email : " +owner.getEmail() +"\n"+"Books Borrowed" +borrowcnt;
    }
}
