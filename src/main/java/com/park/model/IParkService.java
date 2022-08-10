package com.park.model;

public interface IParkService {

    /**
     * Inicia o estacionamento com um determinado numero de vagas
     *
     * @param numeroVagas quantidade de vagas no estacionamento
     */
    void iniciaEstacionamento(String numeroVagas);

    /**
     * Recupera a quantidade de vagas ocupadas
     *
     * @return quantidade de vagas ocupadas
     */
    int getQtdVagasOcupadas();

    /**
     * Recupera a quantidade de vagas disponiveis
     *
     * @return quantidade de vagas disponiveis
     */
    int getQtdVagasDisponiveis();

    /**
     * Recupera a quantidade de vagas total
     *
     * @return quantidade de vagas total
     */
    int getQtdVagas();

    /**
     * Entrada um carro no estacionamento
     *
     * @param placa identificador da placa do carro
     */
    void addCarro(String placa);

    /**
     * Retira um carro do estacionamento
     *
     * @param placa identificador da placa do carro
     */
    void removeCarro(String placa);

    /**
     * Busca a vaga em que o carro está estacionado
     *
     * @param placa identificador da placa do carro
     */
    int encontraCarro(String placa);
}
