public class Operaciones {
    float Num1;
    float Num2;

    public Operaciones(){
        Num1 = 0;
        Num2= 0;
    }

    public Operaciones(float num1, float num2){
        Num1 = num1;
        Num2 = num2;
    }

    public float suma(){
        return Num1 + Num2;
    }

    public float resta(){
        return Num1 - Num2;
    }

    public float multiplicacion(){
        return Num1 * Num2;
    }

    public float division(){
        return Num1 / Num2;
    }

    public double exponencial(){
        return Math.pow(Num1, Num2);
    }

}
