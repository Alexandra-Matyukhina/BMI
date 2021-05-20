public class BmiService {
    public double calculate(double weight, double height){

        double bmi = (int)(weight/ (height * height));
        return bmi;

    }
}