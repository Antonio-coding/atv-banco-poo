// BancoCamadas\src\repository\IRepositorioConta.java
package repository;

import entity.Conta;
import java.util.ArrayList;

public interface IRepositorioConta {
  public void inserirConta(Conta c);

  public void alterarConta(Conta c);

  public void removerConta(Conta c);

  public Conta buscarConta(int numero);

  public boolean verificarExistenciaDeConta(int numero);

  public ArrayList<Conta> buscarTodas();
}
