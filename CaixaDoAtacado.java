import java.util.Scanner;

class CaixaDoAtacado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto[] estoque = new Produto[3];
        estoque[0] = new Produto(1, "Arroz", 10.0, 10);
        estoque[1] = new Produto(2, "Feijão", 5.0, 20);
        estoque[2] = new Produto(3, "Macarrão", 3.5, 30);

        System.out.println("Catálogo de produtos:");
        for (Produto produto : estoque) {
            System.out.println(produto.id + " - " + produto.nome + " - R$" + produto.preco);
        }

        System.out.print("Digite o ID do produto que deseja comprar: ");
        int idProduto = scanner.nextInt();

        System.out.print("Digite a quantidade que deseja comprar: ");
        int quantidadeProduto = scanner.nextInt();

        Produto produtoEscolhido = null;
        for (Produto produto : estoque) {
            if (produto.id == idProduto) {
                produtoEscolhido = produto;
                break;
            }
        }

        if (produtoEscolhido == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        double valorTotalSemDesconto = produtoEscolhido.calcularValorTotal();
        double valorTotalComDesconto = produtoEscolhido.calcularValorTotalComDesconto();

        System.out.println("Valor total sem desconto: R$" + valorTotalSemDesconto);
        System.out.println("Valor total com desconto: R$" + valorTotalComDesconto);

        System.out.print("Digite a forma de pagamento (1 - Débito, 2 - Dinheiro, 3 - Crédito): ");
        int formaPagamento = scanner.nextInt();

        switch (formaPagamento) {
            case 1:
                System.out.println("Forma de pagamento: Débito");
                break;
            case 2:
                System.out.println("Forma de pagamento: Dinheiro");
                valorTotalComDesconto *= 0.95; // Aplica desconto de 5%
                break;
            case 3:
                System.out.println("Forma de pagamento: Crédito");
                valorTotalComDesconto *= 1.03; // Aplica acréscimo de 3%
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                return;
        }

        produtoEscolhido.quantidade -= quantidadeProduto;

        System.out.println("Quantidade em estoque do produto " + produtoEscolhido.nome + ": " + produtoEscolhido.quantidade);
        System.out.println("Valor total da compra: R$" + valorTotalComDesconto);
    }
}
