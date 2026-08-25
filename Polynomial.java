import java.io.File;
import java.io.IOException;

public class Polynomial {
    double[] coefficients;
    int[] exponents;

    public Polynomial() {
        coefficients = new double[] { 0 };
        exponents = new int[] { 0 };
    }

    public Polynomial(double[] coeff, int[] exponents) {
        this.coefficients = coeff.clone();
        this.exponents = exponents.clone();
    }

    public Polynomial(File file) throws IOException {

    }

    public Polynomial add(Polynomial p) {
        double[] rawCoeffs = new double[this.coefficients.length + p.coefficients.length];
        int[] rawExps = new int[rawCoeffs.length];

        int size = 0;

        // first dump all terms from this into raw arrays
        for (int i = 0; i < this.coefficients.length; i++) {
            rawCoeffs[size] = this.coefficients[i];
            rawExps[size] = this.exponents[i];
            size++;
        }

        // then for each term in p...
        for (int i = 0; i < p.coefficients.length; i++) {
            int idx = findExponent(rawExps, size, p.exponents[i]);
            if (idx == -1) {
                // your code here
            } else {
                // your code here
            }
        }

        // now trim to size and return new Polynomial
        // hint: Arrays.copyOfRange might help here
    }
        // returns the index of exp in exponents array, or -1 if not found
    int findExponent(int[] exponents, int size, int exp) {
        for (int i = 0; i < size; i++) {
            if (exponents[i] == exp) return i;
        }
        return -1;
    }
    
    public double evaluate(double num) {
        double result = 0.0;
        for (int i = 0; i < this.coefficients.length; i++) {
            double term = this.coefficients[i];
            for (int j = 0; j < this.exponents[i]; j++) {
                term *= num;
            }
            result += term;
        }
        return result;
    }

    public boolean hasRoot(double num) {
        return this.evaluate(num) == 0.0;
    }
}
