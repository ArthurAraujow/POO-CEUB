public class Item {
    private String nome;
    private double preco;
    private int id;
    private int quantidade;
    public Item(String nome, double preco, int id, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
        this.quantidade = quantidade;
    }
    public float precoUnitario() {
        return (float) preco;
    }
    public int quantidade() {
        return quantidade;
    }
    public double calcularTotal() {
        return preco * quantidade;
    }
}