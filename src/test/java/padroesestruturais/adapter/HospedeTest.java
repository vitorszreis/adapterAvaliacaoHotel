package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveRetornarClassificacaoHospede() {
        Hospede hospede = new Hospede();
        hospede.setAvaliacao("Excelente");

        assertEquals("Excelente", hospede.getAvaliacao());
    }

    @Test
    void deveRetornarNotaHospede() {
        Hospede hospede = new Hospede();
        hospede.setAvaliacao("Excelente");

        assertEquals(10.0f, hospede.getNota());
    }

    @Test
    void deveConverterClassificacaoBomParaNota() {
        Hospede hospede = new Hospede();
        hospede.setAvaliacao("Bom");

        assertEquals(8.0f, hospede.getNota());
        assertEquals("Bom", hospede.getAvaliacao());
    }

    @Test
    void deveConverterClassificacaoRuimParaNota() {
        Hospede hospede = new Hospede();
        hospede.setAvaliacao("Ruim");

        assertEquals(0.0f, hospede.getNota());
        assertEquals("Ruim", hospede.getAvaliacao());
    }

}
