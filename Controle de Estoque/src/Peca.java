import java.util.Scanner;

abstract public class Peca implements Item {
    String descricao;
    Integer quantidade;
    Integer estoqueMinimo;
    Integer estoqueMaximo;

    private Scanner sc;

    public Peca(String descricao, Integer quantidade, Integer estoqueMinimo, Integer estoqueMaximo, Scanner scanner) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.sc = scanner;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public Integer getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public void setEstoqueMaximo(Integer estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    @Override
    public void reposicaoEstoque() {
        if(quantidade < estoqueMinimo) {
            quantidade = estoqueMaximo;
            System.out.println("Estoque reposto para o máximo!");
        }
    }

    @Override
    public void venda() {
    }

    @Override
    public String toString() {
        return descricao + " - Quantidade: " + quantidade;
    }

}
