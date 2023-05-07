public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double weight_kg = 74.3;
            double height_m = 1.78;
            int bmi = service.calculate(weight_kg,height_m); //
            System.out.println(bmi);
        }
    }
