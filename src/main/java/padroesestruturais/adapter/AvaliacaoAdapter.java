package padroesestruturais.adapter;

public class AvaliacaoAdapter extends AvaliacaoNota {

    private IAvaliacao avaliacaoTexto;

    public AvaliacaoAdapter(IAvaliacao avaliacaoTexto) {
        this.avaliacaoTexto = avaliacaoTexto;
    }

    public String recuperarAvaliacao() {
        if (this.getNota() >= 10.0f)
            avaliacaoTexto.setAvaliacao("Excelente");
        else
            if (this.getNota() >= 8.0f)
                avaliacaoTexto.setAvaliacao("Bom");
            else
                if (this.getNota() >= 6.0f)
                    avaliacaoTexto.setAvaliacao("Regular");
                else
                    avaliacaoTexto.setAvaliacao("Ruim");
        return avaliacaoTexto.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoTexto.getAvaliacao().equals("Excelente"))
            this.setNota(10.0f);
        else
            if (avaliacaoTexto.getAvaliacao().equals("Bom"))
                this.setNota(8.0f);
            else
                if (avaliacaoTexto.getAvaliacao().equals("Regular"))
                    this.setNota(6.0f);
                else
                    this.setNota(0.0f);
    }
}
