package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev extends Pessoa{

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    @Override
    public void progredir(){
        Optional<Conteudo> conteudo = this.getConteudosInscritos().stream().findFirst();
        if(conteudo.isPresent()){
            this.getConteudosConcluidos().add(conteudo.get());
            this.getConteudosInscritos().remove(conteudo.get());
        } else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public Double calcularTotalXP(){
        return this.getConteudosConcluidos().stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosConcluidos());
    }
}
