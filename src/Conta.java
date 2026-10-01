public class Conta {

    private String titular;
    private double saldo;
    private double limite;

    public Conta(String titular, double limite) {
        this.titular = titular;
        saldo = 0;
        this.limite = limite;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            IO.println("deposito de R$" + valor + " realizado");
            IO.println("saldo; R$" + saldo);
        } else {
            IO.println("deposito invalido invalido");
        }
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            IO.println("valor de saque invalido");
        } else {
            if (valor <= saldo) {
                saldo -= valor;
                IO.println("saque de R$" + valor + " realizado");
                IO.println("saldo; R$;" + saldo);
            } else {

                if (valor > limite) {
                    IO.println("saque negado");
                    IO.println("limite ultrapassado");
                } else {
                    double credito = valor - saldo;
                    limite -= credito;
                    IO.println("credito utilizado");
                    IO.println("LIMITE RESTANTE R$" + limite);
                }
            }
        }
    }

}