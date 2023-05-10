public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double weightKg = 74.3;
            double heightM = 1.78;
            int bmi = service.calculate(weightKg,heightM); //
            System.out.println(bmi);
        }
    }
