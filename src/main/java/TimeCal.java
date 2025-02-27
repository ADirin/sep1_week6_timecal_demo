public class TimeCal {
    public static void main(String[] args) {
        System.out.println("Time needs " + timeCalulator(100.0, 100.0));
    }

    public static double timeCalulator(double x, double v){
        return x/v;
    }
}
