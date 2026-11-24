package padroesestruturais.adapter;

public class AvaliacaoTexto implements IAvaliacao {

    private String classificacao;

    @Override
    public String getAvaliacao() {
        return this.classificacao;
    }

    @Override
    public void setAvaliacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
