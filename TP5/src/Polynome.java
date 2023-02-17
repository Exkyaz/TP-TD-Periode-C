import java.util.Arrays;

import java.lang.Math;

public class Polynome {

    private static final int DEGRE_MAX = 8;

    public float[] coefficients;

    public Polynome() {
        coefficients = new float[DEGRE_MAX];
        Arrays.fill(this.coefficients, 0);
    }

    public Polynome(float... coefficients) {
        this();
        assert (coefficients.length <= DEGRE_MAX);
        for (int i = 0; i < coefficients.length; i++) {
            this.coefficients[i] = coefficients[i];
        }
    }

    public Polynome(float coefficient, int degre) {
        this();
        this.coefficients[degre] = coefficient;
    }

    public Polynome(float coefficient) {
        this(coefficient, 0);
    }

    public Polynome addition(Polynome p) {
        Polynome result = new Polynome();
        for (int i = 0; i < DEGRE_MAX; i++) {
            result.coefficients[i] = this.coefficients[i] + p.coefficients[i];
        }
        return result;
    }

    public static Polynome additionner(Polynome p1, Polynome p2) {
        assert(p1 != null && p2 != null);
        return p1.addition(p2);
    }

    public Polynome deriver() {
        Polynome result = new Polynome();
        for (int i = 1; i < DEGRE_MAX; i++) {
            result.coefficients[i - 1] = this.coefficients[i] * i;
        }
        return result;
    }

    public float evaluer(float x) {
        float result = 0f;
        for (int i = 0; i < DEGRE_MAX; i++) {
            result += this.coefficients[i] * Math.pow(x, i);
        }
        return result;
    }
}