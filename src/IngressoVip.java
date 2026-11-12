public class IngressoVip extends Ingresso{
    private boolean temBackstage;

    public IngressoVip(int codigo, String nomeCliente, String nomeEvento, boolean temBackstage) {
        super(codigo, nomeCliente, nomeEvento);
        this.temBackstage = temBackstage;
    }

    @Override
    public double calcularValorFinal() {
        if(temBackstage){
            return super.calcularValorFinal() * 1.5 * 1.6;
        }
        return super.calcularValorFinal() * 1.5;
    }

    @Override
    public String toString() {
        if(temBackstage){
            return super.toString() + "Ingresso Vip COM BACKSTAGE";
        }else{
            return super.toString() + "Ingresso Vip SEM BACKSTAGE";
        }

    }

    public boolean isTemBackstage() {
        return temBackstage;
    }

    public void setTemBackstage(boolean temBackstage) {
        this.temBackstage = temBackstage;
    }
}
