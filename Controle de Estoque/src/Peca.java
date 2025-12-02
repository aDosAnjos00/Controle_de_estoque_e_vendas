abstract public class Peca implements Item {
    String descricao;
    Integer quantidade;
    Integer estoqueMinimo;
    Integer estoqueMaximo;

    public Peca(String descricao, Integer quantidade, Integer estoqueMinimo, Integer estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
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
