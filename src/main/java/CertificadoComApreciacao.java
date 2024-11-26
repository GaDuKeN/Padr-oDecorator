public class CertificadoComApreciacao extends CertificadoDecorator {

    public CertificadoComApreciacao(Certificado certificado) {
        super(certificado);
    }

    @Override
    public String emitir() {
        return super.emitir() + " - Apreciamos sua participação!";
    }
}
