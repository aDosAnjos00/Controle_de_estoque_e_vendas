import java.util.Scanner;

public class Acessorio extends Peca {

    private Scanner sc = new Scanner(System.in);

    public Acessorio(String descricao, Integer quantidade, Integer estoqueMinimo, Integer estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        try {
            System.out.print("Quantidade vendida de " + descricao + ": ");
            int qtd = Integer.parseInt(sc.nextLine());
            if (qtd <= 0) {
                System.out.println("Quantidade deve ser positiva!");
                return;
            }
            if (qtd > quantidade) {
                System.out.println("Estoque insuficiente! Disponível: " + quantidade);
                return;
            }
            quantidade -= qtd;
            System.out.println("Venda realizada: " + qtd + " unidades.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada deve ser um número inteiro!");
        }
    }
}

