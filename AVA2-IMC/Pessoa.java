public class Pessoa {
    private final String nome;
    private final double peso;
    private final double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    public String classificarIMC() {
        double imc = calcularIMC();
        
        if (imc < 18.5) return "Baixo peso";
        if (imc < 25) return "Peso adequado";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade Grau I";
        if (imc < 40) return "Obesidade Grau II";
        return "Obesidade Grau III";
    }

    public void exibirResultado() {
        System.out.printf("""
            \n
            Nome: %s
            IMC: %.1f
            Classificação: %s
            """, nome, calcularIMC(), classificarIMC());
    }
}