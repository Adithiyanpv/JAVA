public class swap_two_numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Numbers before swapping: "+a+" "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swapping: "+a+" "+b);
    }
}
