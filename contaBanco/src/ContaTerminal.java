
public class Main {

    public static void main(String[] args) {
        
        double saldo = 25;
        double valorSolicitado = 18;

        if( valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
           } else { 
              System.out.println ("Saldo indisponivel  " + saldo);
           }
            System.out.println ("Saldo atual  " + saldo );
    
    
     saldo = 15;
     valorSolicitado = 22;

    if( valorSolicitado <= saldo){
        saldo = saldo - valorSolicitado;
       } else { 
          System.out.println ("Saldo indisponivel  " + saldo);
       }
        System.out.println ("Saldo atual  " + saldo );
}
} 
