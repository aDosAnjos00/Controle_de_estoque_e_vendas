import java.util.InputMismatchException;
import java.util.Scanner;

public class Acessorio extends Peca {

    private Scanner sc;

    public Acessorio(String descricao, Integer quantidade, Integer estoqueMinimo, Integer estoqueMaximo, Scanner sc) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo, sc);
        this.sc = sc;
    }

    @Override
    public void venda() {
        try {
            System.out.print("Quantidade vendida de " + descricao + ": ");
            int qtd = Integer.parseInt(sc.nextLine());
            if (qtd > 0 && qtd <= this.getQuantidade()) {

                this.setQuantidade(this.getQuantidade() - qtd);

                System.out.println("Venda de " + qtd + " unidades realizada!");
            } else {
                System.out.println("Quantidade insuficiente ou entrada errada!");
            }
        } catch (InputMismatchException var2) {
            System.out.println("Erro: entrada deve ser um número inteiro!");
            sc.nextLine();
        }
    }
}

