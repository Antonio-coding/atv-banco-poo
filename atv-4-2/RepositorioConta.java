// atv-4-2\RepositorioConta.java

// Camada de Acesso a Dados (Dados)

public class RepositorioConta {

  private Conta[] contas;
  private int indice;

  public RepositorioConta() {
    this.contas = new Conta[100]; // Tamanho do array para armazenar as contas
    this.indice = 0;
  }

  public void inserir(Conta conta) {
    contas[indice++] = conta;
  }

  public Conta buscar(String numero) {
    for (Conta conta : contas) {
      if (conta != null && conta.getNumero().equals(numero)) {
        return conta;
      }
    }
    return null;
  }

  public boolean remover(String numero) {
    for (int i = 0; i < indice; i++) {
      if (contas[i] != null && contas[i].getNumero().equals(numero)) {
        contas[i] = null;
        rearranjarContas(i);
        indice--;
        return true;
      }
    }
    return false;
  }

  private void rearranjarContas(int posicaoRemovida) {
    for (int i = posicaoRemovida; i < indice - 1; i++) {
      contas[i] = contas[i + 1];
    }
  }

  public void atualizar(Conta conta) {
    for (int i = 0; i < indice; i++) {
      if (
        contas[i] != null && contas[i].getNumero().equals(conta.getNumero())
      ) {
        contas[i] = conta;
        break;
      }
    }
  }

  public boolean verificarExistencia(String numero) {
    for (Conta conta : contas) {
      if (conta != null && conta.getNumero().equals(numero)) {
        return true;
      }
    }
    return false;
  }

  public Conta[] listar() {
    Conta[] todasContas = new Conta[indice];
    for (int i = 0; i < indice; i++) {
      todasContas[i] = contas[i];
    }
    return todasContas;
  }
  // Outras operações de acesso a dados relacionadas às contas
}
