package com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "com.dio.desafio.Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
