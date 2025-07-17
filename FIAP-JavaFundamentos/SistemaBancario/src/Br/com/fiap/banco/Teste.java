package Br.com.fiap.banco;

public class Teste {

    public static void main(String[] args) {

        Conta cc = new Conta();
        cc.saldo = 50.0;
        cc.agencia = 6969;
        cc.numero = 2003;

        cc.depositar(100);
        System.out.println(cc.verificarSaldo());

        Conta poupanca = new Conta(2003, 6969, 100);
        poupanca.retirar(50);
        System.out.println(poupanca.verificarSaldo());


    }
}
