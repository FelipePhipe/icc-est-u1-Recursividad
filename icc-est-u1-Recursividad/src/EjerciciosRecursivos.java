import java.util.Scanner;

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



    public int getPotencia(int base, int exponente){

        System.out.println(base+"^"+ exponente);
        if(exponente==0){
            return 1;
        }
        int resultadoPotencia=getPotencia(base, exponente-1);
        int resultadoP= base*resultadoPotencia;
        
        return resultadoP;
    }
    public int sumaDigitos(int num){
        if (num<10){
            return num;
        }
        int UDig= num%10;
        int oneNum= num/10;
        return UDig+ sumaDigitos(oneNum);

    }


    // public int secuenciaNum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return secuenciaNum(n)secuenciaNum(n-1);
    // }
}
