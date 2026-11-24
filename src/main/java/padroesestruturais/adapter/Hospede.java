package padroesestruturais.adapter;

public class Hospede {

    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Hospede() {
        avaliacao = new AvaliacaoTexto();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String classificacao) {
        avaliacao.setAvaliacao(classificacao);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    // Método apenas para mostrar que está convertendo a classificação em nota através do adaptador
    public float getNota() {
        return persistencia.getNota();
    }

}
