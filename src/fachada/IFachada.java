package src.fachada;

import src.entity.Conta;

public interface IFachada {
  void inserirConta(Conta c);
  void alterarConta(Conta c);
  void removerConta(Conta c);
  Conta buscarConta(Conta c);
  Conta[] buscarTodos();
}
