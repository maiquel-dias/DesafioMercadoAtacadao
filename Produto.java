import java.util.Scanner;

class Produto {
    int id;
    String nome;
    double preco;
    int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public double calcularValorTotalComDesconto() {
        double valorTotal = calcularValorTotal();
        if (quantidade >= 1 && quantidade <= 5) {
            return valorTotal;
        } else if (quantidade >= 6 && quantidade <= 15) {
            return valorTotal * 0.9;
        } else if (quantidade >= 16 && quantidade <= 25) {
            return valorTotal * 0.8;
        } else {
            return valorTotal * 0.75;
        }
    }
}