public class DadosConta {
    private String nome;
    private String tipoConta;
    private double saldo;

    public DadosConta(String nome, String tipoConta, double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double receberValor(double receber) {
        this.saldo = this.saldo + receber;
        return this.saldo;
    }

    public double sacarValor(double sacar) {
        this.saldo = this.saldo - sacar;
        return this.saldo;
    }

    public void extrato() {
        System.out.println("Cliente: " + this.nome);
        System.out.println("Tipo de conta: " + this.tipoConta);
        System.out.println("Seu saldo atual: R$ " + this.saldo);
    }
}