import java.util.Date;

public class pedido {
    private Date data;
    private int codigo;
    private int hora;
    private String status;
    private vendedor vendedor;
    private cliente cliente;
    private String itens;
    public pedido(Date data, int codigo, int hora, String status, vendedor vendedor, cliente cliente, String itens) {
        this.data = data;
        this.codigo = codigo;
        this.hora = hora;
        this.status = status;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.itens = itens;
    }
    public void adicionarItem(Item item) {
        if (this.itens == null || this.itens.isEmpty()) {
            this.itens = item.toString();
        } else {
            this.itens += ", " + item.toString();
        }
    }
    public double valor() {
        double total = 0;
        return total;
    }
}