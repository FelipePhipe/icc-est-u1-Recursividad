public class App {
    public static void main(String[] args) throws Exception {  //los metodos staticos solo pueden llamar a metodos estaticos, antes en el de abajo no estaba estatico, pero se cambio para que funcione
        
        int n = 5;
        int rresultadoFinal = factorial( n );
        System.out.println("Resultado: " + rresultadoFinal);

        EjerciciosRecursivos e=new EjerciciosRecursivos();
        System.out.println("Serie fibonacci");
        int fibo=e.fibonacci(5);
        System.out.println(fibo);
        System.out.println("Potencia");
        int getpo=e.getPotencia(5, 2);
        System.out.println(getpo);
        System.out.println("Suma de digitos");
        int sum=e.sumaDigitos(125);
        System.out.println(sum);
        System.out.println("Suma consecutivos");
        int sumC=e.sumaConsecutivos(10);
        System.out.println(sumC);

    }

    public static int factorial(int n){
        if(n==0){
            System.out.println("Alcanze el caso base");
            return 1;
        } 

        int resultadoParcial = n * factorial(n-1);
        System.out.println("Calculando factorial de: " + n + " * " + "factorial(" + (n-1) + " -1)");
        return resultadoParcial;
    }
    
}