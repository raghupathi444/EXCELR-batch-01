public class Demo054 {
     public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Demo054 calc = new Demo054();
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + calc.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.7: " + calc.add(2.5, 3.7));
    }
}
