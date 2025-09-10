public class BodyMassIndex {

    public int calculate(int a, int b)  {
        int result;
        if (a > 0)  {
            result = a / b * b;
        }  else  {
            result = 0;
        }

        return result;
    }
}
