public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 5.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo "+ saldo);
        }
            
        else
            System.out.println("Saldo Insuficiente");

        
  }
  
}
