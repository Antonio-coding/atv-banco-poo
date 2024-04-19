package src.respository;

import src.entity.Conta;

public interface IRepositoryConta {
  public void inserirConta(Conta c);

  public void alterarConta(Conta c);

  public void removerConta(int numero);

  public Conta buscarConta(int numero);

  public boolean verificarExistenciaConta(int numero);

  public Conta buscarTodos();
}
