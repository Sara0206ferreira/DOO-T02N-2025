package calcMyPlant;



public class Vendedor {
    private String nome;
    private int idade;
    private String loja;  
    private String cidade;
    private String bairro;
    private String rua;
    private double salarioBase;
    private double[] salarioRecebido; 

    public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua,
                    double salarioBase, double[] salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }
    
    
    public void apresentarse() {
        System.out.println("Nome: " + nome + ", |Idade: " + idade + ", |Loja: " + loja);
    }
    
    
    public double calcularMedia() {
        double soma = 0;
        for (double s : salarioRecebido) {
            soma += s;
        }
        return soma / salarioRecebido.length;
    }
    
    
    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
