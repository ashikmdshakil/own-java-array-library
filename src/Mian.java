public class Mian {
    public static void main(String[] args) {
        Arrays numbers = new Arrays();
        numbers.input(100);
        numbers.input(200);
        numbers.input(300);
        numbers.input(400);
        numbers.input(500);
        //numbers.remove(1);
        //numbers.add(0,1000);
        System.out.println("The index number is "+numbers.findIndex(300));
        numbers.print();
    }
}
