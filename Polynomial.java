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
        longer = calling_length;
	if (arg_length > calling_length) {
		longer = arg_length
	}
	
	double[] coeff = new double[longer];
	for (int i = 0; i < longer; i++) {
		double a = 0.0;
		try {
			a = calling_length[i] 
		} catch {
			a = 0.0
		}
		double b = 0.0;
		try {
			b = arg_length[i]
		}
		catch {
			b = 0.0
		}
		coeff[i] = a + b;
	}
	Polynomial result = new Polynomial(coeff);
        return result;
    }

    public double evaluate(double num) {
        return 0.0;
    }

    public boolean hasRoot(double num) {
        return this.evaluate(num) == 0.0;
    }
} 
