public class IngressoVIP extends IngressoDecorator {

    public IngressoVIP(Ingresso ingresso) {
        super(ingresso);
    }

    @Override
    public String emitir() {
        return super.emitir() + " - VIP";
    }
}
