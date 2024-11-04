package com.trybe.acc.java;

import java.util.ArrayList;
import java.util.List;

/**
 * author joao.
 *
 */
public class Agenda {
  private List<String> contatos = new ArrayList<>();

  void incluirContato(String nome, String telefone) {
    this.contatos.put(nome, telefone);
  }

  void excluirContato(String pessoa) {
    this.contatos.remove(pessoa);
  }

  boolean verificaContato(String pessoa) {
    return this.contatos.contains(pessoa);
  }

  int tamanhoAgenda() {
    return this.contatos.size();
  }
}
