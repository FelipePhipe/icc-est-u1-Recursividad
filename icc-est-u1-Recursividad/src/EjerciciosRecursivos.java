public class EjerciciosRecursivos {
    public int fibonacci(int n) {
        //if (n==0|| n==1){
        if (n<=1){
            return n;

        }
        //} else if(n==1){
            //return 1;
        return fibonacci(n-1)+fibonacci(n-2);
        
    }



    public int sumaConsecutivos(int n){

        // if (n==1) return1;
        //return n+sumaConsecutivos(n-1);
        if (n==1){
            return 1;
        }
        int resultadoParcial=sumaConsecutivos(n-1);
        int resultado=n+ resultadoParcial;
        return resultado;
    }
}
