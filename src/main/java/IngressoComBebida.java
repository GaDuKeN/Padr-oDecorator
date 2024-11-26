public class IngressoComBebida extends IngressoDecorator {

    public IngressoComBebida(Ingresso ingresso) {
        super(ingresso);
    }

    @Override
    public String emitir() {
        return super.emitir() + " - Inclui Bebida";
    }
}
