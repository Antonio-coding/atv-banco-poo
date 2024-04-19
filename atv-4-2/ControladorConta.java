// Camada de Regras de Negócio (Negócio)
public class ControladorConta {

  private RepositorioConta repositorio;

  public ControladorConta() {
    this.repositorio = new RepositorioConta();
  }

  public void inserirConta(Conta conta) {
    repositorio.inserir(conta);
  }

  public Conta buscarConta(String numero) {
    return repositorio.buscar(numero);
  }

  public boolean removerConta(String numero) {
    return repositorio.remover(numero);
  }

  public void atualizarConta(Conta conta) {
    repositorio.atualizar(conta);
  }

  public boolean verificarExistencia(String numero) {
    return repositorio.verificarExistencia(numero);
  }

  public Conta[] listarContas() {
    return repositorio.listar();
  }
  // Outras regras de negócio relacionadas às contas
}
