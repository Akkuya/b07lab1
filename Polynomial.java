public class Polynomial {
    double[] coefficients;
    
    public Polynomial() {
        coefficients = new double[] {0};
    }

    public Polynomial(double[] args) {
        this.coefficients = args.clone();
    }

    public Polynomial add(Polynomial p) {
        int calling_length = this.coefficients.length;
        int arg_length = this.coefficients.length;

        return p;
    }

    public double evaluate(double num) {
        return 0.0;
    }

    public boolean hasRoot(double num) {
        return this.evaluate(num) == 0.0;
    }
} 