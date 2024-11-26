public class TesteEvento {

    public static void main(String[] args) {
        Ingresso ingresso = new IngressoBase();
        ingresso = new IngressoVIP(ingresso); // Decorando com VIP
        ingresso = new IngressoComBebida(ingresso); // Decorando com Bebida
        System.out.println(ingresso.emitir()); // Saída: "Ingresso para o Evento - VIP - Inclui Bebida"

        Certificado certificado = new CertificadoBase();
        certificado = new CertificadoComApreciacao(certificado); // Decorando com Apreciação
        System.out.println(certificado.emitir()); // Saída: "Certificado de Participação no Evento - Apreciamos sua participação!"
    }
}
