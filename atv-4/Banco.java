import java.util.ArrayList;

public class Banco {

  private ArrayList<Conta> contas;

  public Banco() {
    contas = new ArrayList<>();
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

  public Conta buscarContaPorNumero(String numeroConta) throws Exception {
    for (Conta conta : contas) {
      if (conta.getNumero().equals(numeroConta)) {
        return conta;
      }
    }
    throw new Exception("Conta com número " + numeroConta + " não encontrada.");
  }

  public Conta buscarConta(Conta c) throws Exception {
    for (Conta conta : contas) {
      if (conta.equals(c)) {
        return conta;
      }
    }
    throw new Exception("Conta não encontrada.");
  }
}
