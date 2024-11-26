public abstract class CertificadoDecorator implements Certificado {

    private Certificado certificado;

    public CertificadoDecorator(Certificado certificado) {
        this.certificado = certificado;
    }

    @Override
    public String emitir() {
        return certificado.emitir();
    }
}
