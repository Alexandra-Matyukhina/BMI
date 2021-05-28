public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 52; //вес в килограммах
        double height = 1.60; // рост в метрах
        double bmi = service.calculate(52, 1.60);
        System.out.println(bmi);
    }
}