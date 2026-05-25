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
        int arg_length = p.coefficients.length;
        int longer = calling_length;
	if (arg_length > calling_length) {
		longer = arg_length;
	}
	
	double[] coeff = new double[longer];
	for (int i = 0; i < longer; i++) {
		double a = 0.0;
        double b = 0.0;
        if (i < this.coefficients.length) {
            a = this.coefficients[i];
        }
        if (i < p.coefficients.length) {
            b = p.coefficients[i];
        }
		coeff[i] = a + b;
	}
	Polynomial result = new Polynomial(coeff);
        return result;
    }

    public double evaluate(double num) {
        double result = 0.0;
        for(int i = 0; i < this.coefficients.length; i++) {
            double term = this.coefficients[i];
            for (int j = 0; j < i; j++) {
                term*=num;
            }
            result+=term;
        } 
        return result;
    }

    public boolean hasRoot(double num) {
        return this.evaluate(num) == 0.0;
    }
} 
