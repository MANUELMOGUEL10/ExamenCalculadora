import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       float Num1 = 0;
       float Num2 = 0;
       int op = 0;
       do{
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------------------");
            System.out.println("BIENVENIDO A MI CALCULADORA");
            System.out.println("Que operacion desea hacer");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Exponencial");
            System.out.println("6. Salir");
            op = sc.nextInt();
            System.out.println("Digite el primer numero");
            Num1 = sc.nextFloat();
            System.out.println("Digite el segundo numero");
            Num2 = sc.nextFloat();

            Operaciones oper = new Operaciones(Num1, Num2);
            double result = 0;

            switch(op){
                case 1: result = oper.suma();
                break;

                case 2: result = oper.resta();
                break;

                case 3: result = oper.multiplicacion();
                break;

                case 4: result = oper.division();
                break;

                case 5: result = oper.exponencial();
                break;

            }
        
            System.out.println("El resultado de tu operacion es:"+result);
            System.out.println("------------------------------------");
       }
       while(op !=6);

    }
}
