package se.iths.java21.methods;

public class MethodDemo {
    public static void main(String[] args) {
        printMultiplicationTable2();
        int value = 2;
        printMultiplicationTable(value);
        printMultiplicationTable(3);

        int x = add(5,6);
        int x2 = 1 + add(2,2) * add(1,1);

    }

    private static void printMultiplicationTable2() {
        for (int i2 = 1; i2 <= 10; i2++)
            System.out.println(2 * i2);
    }

    private static void printMultiplicationTable(final int table) {
        for (int i2 = 1; i2 <= 10; i2++)
            System.out.println(table * i2);
    }

    private static int add(int tal1, int tal2){
        return tal1 + tal2;
    }
}
