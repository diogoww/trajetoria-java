package sintaxe.exercicio_proposto;

import java.time.LocalDate;

public class ContaCorrente {
    Interger numero;
    Interger agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;
    boolean ativo = true;

    Double consultarSaldo(){
        return saldo;
    }

    List consultarExtrato (LocalDate dataInicial, LocalDate dataFinal){
        return null;
    }

    void cancelar (String justificativa){

    }

    void transferir (ContaCorrente contaDestino, Double valorTransferido){

    }

    void sacar (Double valorSolicitado){

    }
}
