package Mercado;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double total = 0;
        int quantidade = 0;
        double desconto = 0;

        System.out.println("Bem-vindo ao mercado! Digite o nome do produto: ");
        String produto = teclado.next();
        System.out.println("Digite o preço do produto: ");
        double preco = teclado.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        quantidade = teclado.nextInt();

        total = preco * quantidade;

        if (quantidade >= 11 && quantidade <=20) {
            desconto = total * 0.1;
        } else if (quantidade >=21 && quantidade <= 50){
            desconto = total * 0.2;
        } else if (quantidade > 50){
            desconto = total * 0.25;
        }

        System.out.println("Total= " + total);
        System.out.println("Desconto: " + desconto);
        System.out.println("Total a pagar: " + (total - desconto));

    }
}
