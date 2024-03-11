// atv-3\Banco.java

import java.util.ArrayList;

public class Banco {

  private ArrayList<Conta> contas;

  public Banco() {
    contas = new ArrayList<Conta>();
  }

  public void adicionarConta(Conta conta) {
    contas.add(conta);
  }

  public boolean removerConta(Conta conta) {
    return contas.remove(conta);
  }

  public boolean depositar(int indiceConta, double valor) {
    if (indiceConta >= 0 && indiceConta < contas.size()) {
      contas.get(indiceConta).depositar(valor);
      return true;
    } else {
      return false;
    }
  }

  public boolean sacar(int indiceConta, double valor) {
    if (indiceConta >= 0 && indiceConta < contas.size()) {
      contas.get(indiceConta).sacar(valor);
      return true;
    } else {
      return false;
    }
  }

  // Método para buscar uma conta pelo número
  public Conta buscarContaPorNumero(String numeroConta) throws Exception {
    for (Conta conta : contas) {
      if (conta.getNumero().equals(numeroConta)) {
        return conta;
      }
    }
    throw new Exception("Conta com número " + numeroConta + " não encontrada.");
  }

  // Método para buscar uma conta pelo objeto Conta
  public Conta buscarConta(Conta c) throws Exception {
    for (Conta conta : contas) {
      if (conta.equals(c)) {
        return conta;
      }
    }
    throw new Exception("Conta não encontrada.");
  }
}
