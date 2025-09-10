public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int mass = 98;
        double height = 1.87;
        int heightInt;
        heightInt = (int) height;
        int bmi = service.calculate(mass, heightInt);

        System.out.println(bmi);
    }
}