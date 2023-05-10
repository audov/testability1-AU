public class BmiService {
    public int calculate(double weightKg, double heightM) {
        double bmiIndex = weightKg / Math.pow(heightM, 2);
        int bmi = (int) bmiIndex;
        return bmi;
    }
}