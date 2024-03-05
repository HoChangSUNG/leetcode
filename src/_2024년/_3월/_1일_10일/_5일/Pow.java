package _2024년._3월._1일_10일._5일;

public class Pow {
    public double myPow(double x, int n) {
        return pow(x, (long) n);
    }

    private double pow(double x, long n) {
        if (n < 0) return 1 / pow(x, -n);
        else if (n == 0) return 1;
        if (n % 2 == 0) return pow(x * x, n / 2);
        else return x * pow(x * x, (n - 1) / 2);
    }
}
