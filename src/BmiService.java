public class BmiService {
    public double calculate(double weight, double height) {

        int bmi = (int) (weight / (height * height));
        return bmi;

    }
}