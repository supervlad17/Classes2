public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int weight = 98;
        double height = 1.87;
        int bmi = service.calculate(weight, height);

        System.out.println(bmi);
    }
}