public class Ingresso {
    //4 CARACTERÍSTICAS
    //1 - ATRIBUTOS PRIVADOS
    //2 - GETTERS E SETTERS
    //3 - CONSTRUTOR
    //4 - toString
    private int codigo;
    private String nomeCliente;
    private String nomeEvento;
    private final double valorBase = 100; //constante

    public double calcularValorFinal(){
        return valorBase;
    }

    public Ingresso(int codigo, String nomeCliente, String nomeEvento) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.nomeEvento = nomeEvento;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "codigo=" + codigo +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", nomeEvento='" + nomeEvento + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public double getValorBase() {
        return valorBase;
    }
}
