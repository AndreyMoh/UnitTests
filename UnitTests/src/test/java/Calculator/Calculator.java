package Calculator;

public class Calculator {

    public int getSum(int x, int y) { return x + y; }
    public int getDivide(int x, int y) { return x / y; }
    public int getMultiple(int x, int y) { return x * y; }
    public int factorial(int numb) {
        if (numb == 0) { return 1; }
        int res = 1;
        for (int i = 1; i < numb+1; i++) {
            res *= i;
        }
        return res;
    }
}
