package src.respository;

import entity.Conta;
import java.util.ArrayList;

public class RepositorioContaArrayList implements IRepositoryConta {

  private ArrayList<Conta> contas;

  public RepositorioContaArrayList() {
    this.contas = new ArrayList<Conta>();
  }

  @Override
  public void inserirConta(Conta c) {
    this.contas.add(conta);
  }

  @Override
  public void alterarConta(Conta c) {
    if (this.existeConta(c)) {
      int indice = this.getIndiceDaConta(c);
      this.contas.set(indice, c);
    } else {
      System.out.println("A conta que deseja alterar não existe.");
    }
  }

  @Override
  public void removerConta(Conta c) {
    this.contas.remove(c);
  }

  @Override
  public Conta buscarConta(int numero) {
    for (Conta c : this.contas) {
      if (c.getNumero() == numero) {
        return c;
      }
    }
    return null;
  }

  @Override
  public void verificarExistenciaConta(int numero) {
    Conta conta = buscarConta(numero);
    if (conta != null) {
      System.out.println("A conta existe!");
    } else {
      System.out.println("A conta não existe!");
    }
  }

  @Override
  public Conta[] buscarTodos() {
    return this.contas.toArray(new Conta[this.contas.size()]);
  }
}
