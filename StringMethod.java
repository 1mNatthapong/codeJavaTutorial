public class StringMethod {
    public static void main(String[] args) {
        String message = "Java is Great Fun";
        /*
        เมดธอดพื้นฐาน
        1.toUperCase() ปรับค่าข้อความให้เป็นตัวพิมพ์ใหญ่
        2.toLowerCase() ปรับค่าข้อความให้เป็นตัวพิมพ์เล็ก
        3.Length() เก็บความยาวของสตริง
        4.charAt(2) บอกให้เก็บตัวอักษรตามจำนวนพารามิตเตอร์ที่่ส่งเข้าไป
        */ 
        String upper = message.toUpperCase();
        System.err.println(upper);

        String upper1 = message.toLowerCase();
        System.err.println(upper1);

        int upper2 = message.length();
        System.err.println(upper2);

        char upper3 = message.charAt(2);
        System.err.println(upper3);
    }
}
