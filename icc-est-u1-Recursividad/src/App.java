public class App {
    public static void main(String[] args) throws Exception {  //los metodos staticos solo pueden llamar a metodos estaticos, antes en el de abajo no estaba estatico, pero se cambio para que funcione
        
        int n = 5;
        int rresultadoFinal = factorial( n );
        System.out.println("Resultado: " + rresultadoFinal);
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
    EjerciciosRecursivos e=new EjerciciosRecursivos();
    int fibo=e.fibonacci(5);
}