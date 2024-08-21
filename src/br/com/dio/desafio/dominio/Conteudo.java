package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final Double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    private Instrutor instrutor;

    public abstract Double calcularXP();

    public abstract Double calcularBonusInstrutor();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
}
