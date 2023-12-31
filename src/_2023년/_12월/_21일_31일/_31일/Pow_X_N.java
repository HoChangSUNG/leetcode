package _2023년._12월._21일_31일._31일;

public class Pow_X_N {
    public double myPow(double x, int n) {
        return pow(x, (long) n);
    }

    private double pow(double x, long n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / pow(x, -n);

        if (n % 2 == 0) return pow(x * x, n / 2);
        else return x * pow(x * x, (n - 1) / 2);
    }
}
