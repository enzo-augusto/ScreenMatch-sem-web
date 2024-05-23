package br.com.alura.service;

public interface IconverteDados
{
    public <T> T obterDados(String json, Class<T> classe);
}
