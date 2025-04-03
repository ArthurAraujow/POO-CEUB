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
        return peso / Math.pow(altura, 2);
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        
        if (imc < 18.5) return "Baixo peso - Procure um médico";
        if (imc < 25) return "Peso adequado";
        if (imc < 30) return "Sobrepeso - Atenção aos riscos";
        if (imc < 35) return "Obesidade Grau I - Busque orientação";
        if (imc < 40) return "Obesidade Grau II - Avaliação urgente";
        return "Obesidade Grau III - Risco elevado";
    }

    public void exibirResultado() {
        System.out.printf("""
            \n=== RESULTADO ===
            Nome: %s
            IMC: %.1f
            Classificação: %s
            """, nome, calcularIMC(), classificarIMC());
    }
}