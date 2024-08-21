package br.com.dio.desafio.dominio;

public class Instrutor extends Pessoa{
    private Double salario = 3000d;

    public Double calcularSalarioTotal(){
        return this.getConteudosConcluidos().stream().mapToDouble(Conteudo::calcularBonusInstrutor).sum() + this.salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void inscreverConteudo(Conteudo conteudo) {
        this.getConteudosInscritos().add(conteudo);
    }
}
