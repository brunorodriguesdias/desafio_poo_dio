package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private Integer cargaHoraria;

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public Double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public Double calcularBonusInstrutor() {
        return this.getInstrutor().getSalario() * 0.05;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
