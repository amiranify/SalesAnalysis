public class Main {
    public static void main(String[] args) {
        int[] sales = {10, 100, 50, 15000, 2000, 600};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
