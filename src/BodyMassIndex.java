public class BodyMassIndex {

    public int calculate(int weight, double height)  {

        double bmi = weight / (height * height);
        return (int) bmi;

    }
}
