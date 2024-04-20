package com.example.models;

public record Aluno(String nome, String turma, Integer rm) {

    @Override
    public String toString(){
        return rm + " | " + nome + " - " + turma; 
    }

}