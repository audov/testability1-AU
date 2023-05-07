public class BmiService {
    public int calculate(double weight_kg, double height_m) {
        double bmi_index = weight_kg / Math.pow(height_m, 2);
        int bmi = (int) bmi_index;
        return bmi;
    }
}