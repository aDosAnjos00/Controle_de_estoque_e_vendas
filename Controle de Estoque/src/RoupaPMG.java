import java.util.Scanner;

public class RoupaPMG implements Item {
    String descricao;
    Integer quantidadeP;
    Integer quantidadeM;
    Integer quantidadeG;
    Integer estoqueMinimo;
    Integer estoqueMaximo;

    private Scanner sc;

    public RoupaPMG(String descricao, Integer p, Integer m, Integer g, Integer estoqueMinimo, Integer estoqueMaximo, Scanner scanner) {
        this.descricao = descricao;
        this.quantidadeP = p;
        this.quantidadeM = m;
        this.quantidadeG = g;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.sc = scanner;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public void venda() {
        System.out.print("Tamanho (P/M/G): ");
        String tam = sc.nextLine().trim().toUpperCase();
        if (!tam.matches("[PMG]")) {
            System.out.println("Tamanho inválido! Use P, M ou G.");
            return;
        }

     switch (tam) {
         case "P":
             if (quantidadeP > 0) {
                 System.out.print("Quantidade: ");
                 int qtd = Integer.parseInt(sc.nextLine());
                 quantidadeP -= qtd;
                 System.out.println("Venda realizada! Estoque P restante: " + quantidadeP);
             } else {
                 System.out.println("Sem estoque P!");
             }
             break;
         case "M":
             if (quantidadeM > 0) {
                 System.out.print("Quantidade: ");
                 int qtd = Integer.parseInt(sc.nextLine());
                 quantidadeM -= qtd;
                 System.out.println("Venda realizada! Estoque M restante: " + quantidadeM);
             } else {
                 System.out.println("Sem estoque M!");
             }
             break;
         case "G":
             if (quantidadeG > 0) {
                 System.out.print("Quantidade: ");
                 int qtd = Integer.parseInt(sc.nextLine());
                 quantidadeG -= qtd;
                 System.out.println("Venda realizada! Estoque G restante: " + quantidadeG);
             } else {
                 System.out.println("Sem estoque G!");
             }
             break;
         default:
                 System.out.println("Tamanho inválido!");
     }
    }

    @Override
    public void reposicaoEstoque() {
        if (quantidadeP < estoqueMinimo) quantidadeP = estoqueMaximo;
        if (quantidadeM < estoqueMinimo) quantidadeM = estoqueMaximo;
        if (quantidadeG < estoqueMinimo) quantidadeG = estoqueMaximo;
    }

    @Override
    public String toString() {
        return descricao + " - P: " + quantidadeP + " | M: " + quantidadeM + " | G: " + quantidadeG +
                " (Mín: " + estoqueMinimo + ", Máx: " + estoqueMaximo + ")";
    }
}
