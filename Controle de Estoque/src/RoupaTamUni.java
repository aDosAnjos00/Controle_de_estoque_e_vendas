public class RoupaTamUni extends Peca {

    public RoupaTamUni(String descricao, Integer quantidade, Integer estoqueMinimo, Integer estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        if (quantidade <= 0) {
            System.out.println("Sem estoque!");
            return;
        }
        quantidade -= 1;
        System.out.println("Venda realizada de 1 unidade!");
    }
}
