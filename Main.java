  class Main {
    public static void main(String[] args) {
        int n = 10; 

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                System.out.printf("%4d", a * b);
            }
            System.out.println();
        }
    }
}