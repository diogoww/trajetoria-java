package pilaresPOO.encapsulamento;

public class ComputadorDiogo {
    public static void main(String[] args) {
        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();
        //msnMessenger.salvarHistoricoMensagem();
        //msnMessenger.validarConectadoInternet();
    }
}
