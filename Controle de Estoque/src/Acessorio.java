import java.util.Scanner;

public class Acessorio extends Peca {

    private static Scanner sc = new Scanner(System.in);

    public Acessorio(String descricao, Integer quantidade, Integer estoqueMinimo, Integer estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        try {
            System.out.println("Quantidade vendida de " + descricao + ": ");
            int qtd = Integer.parseInt(sc.nextLine());

            if (qtd < 0) {
                System.out.println("Quamtidade Invalida!!");
                return;
            } else if (qtd > quantidade) {
                System.out.println("Estoque insuficiente!");
                return;
            }

            quantidade -= qtd;
        } catch (Exception e) {
            System.out.println("Erro: Entrada Invalida!");
        }
    }
}

