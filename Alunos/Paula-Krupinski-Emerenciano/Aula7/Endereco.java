public class Endereco {
    private String estado, cidade, bairro, rua;
    private int numero;
    private String complemento;

    public Endereco(String estado, String cidade, String bairro, String rua, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;//
    }

    public void apresentarLogradouro() {
        System.out.println("Endereço: " + rua + ", " + numero + " - " + complemento + " | " + bairro + ", " + cidade + " - " + estado);
    }
}