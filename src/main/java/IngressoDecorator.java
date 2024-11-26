public abstract class IngressoDecorator implements Ingresso {

    private Ingresso ingresso;

    public IngressoDecorator(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    @Override
    public String emitir() {
        return ingresso.emitir();
    }
}
