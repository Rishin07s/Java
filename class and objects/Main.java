package Java;

class Addition {
    int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        int result = addition.add(5, 10);
        System.out.println("Sum: " + result);
    }
}

