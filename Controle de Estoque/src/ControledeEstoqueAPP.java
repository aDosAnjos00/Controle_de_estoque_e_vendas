import java.util.Scanner;

public class ControledeEstoqueAPP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item[] itens = new Item[5];

        itens[0] = new Acessorio("Relogio", 10, 2, 10);
        itens[1] = new RoupaTamUni("Saída de Praia", 5, 1, 5);
        itens[2] = new RoupaPMG("Camisa", 3, 2, 1, 3, 10);
        itens[3] = new Acessorio("Cinto", 8, 2, 10);
        itens[4] = new RoupaPMG("Vestido", 2, 2, 2, 3, 8);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n=== MENU ===");

            for (int i = 0; i < itens.length; i++) {
                String desc;
                if (itens[i] instanceof Peca) {
                    desc = ((Peca) itens[i]).getDescricao();
                } else if (itens[i] instanceof RoupaPMG) {
                    desc = ((RoupaPMG) itens[i]).getDescricao();
                } else {
                    desc = "Item";
                }

                System.out.println(i + " - " + desc);
            }

            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida!");
                continue;
            }

            if (opcao >= 0 && opcao < 5) {
                itens[opcao].venda();
                itens[opcao].reposicaoEstoque();
            }
        }

        System.out.println("\n=== ESTOQUE FINAL ===");
        for (Item it : itens) {
            System.out.println(it.toString());
        }

        sc.close();

    }
}
