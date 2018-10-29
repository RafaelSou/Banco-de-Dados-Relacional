package br.com.abc.br.com.abc.javacore.ZZCjdbc.classes;

import br.com.abc.br.com.abc.javacore.ZZCjdbc.db.GRandom;

import java.util.Random;

import java.util.Objects;

public class Pessoa {
    private Random random = new Random();
    GRandom myrandom = new GRandom();
    private String sexo;
    private String idade;
    private String renda;
    private String escolaridade;
    private String idioma;
    private String pais;
    private String localizacao;


    public Pessoa() {
    }

    public Pessoa(String sexo, String idade, String renda, String escolaridade, String idioma, String pais, String localizacao) {

        this.sexo = sexo;
        this.idade = idade;
        this.renda = renda;
        this.escolaridade = escolaridade;
        this.idioma = idioma;
        this.pais = pais;
        this.localizacao = localizacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sexo);
    }

    public void PopPessoa() {
        this.escolaridade = myrandom.RandomString(2);
        this.idade = myrandom.RandomString(7);
        this.idioma = myrandom.RandomString(12);
        this.localizacao = myrandom.RandomString(24);
        this.pais = myrandom.RandomString(8);
        this.renda = myrandom.RandomString(10);
        this.sexo = myrandom.RandomString(1);
    }
}
