public class Main {

  public static void main(String[] args) {
    Banco banco = new Banco();

    Conta conta1 = new Conta();
    Conta conta2 = new Conta();
    Conta conta3 = new Conta();

    conta1.setNumero("001");
    conta1.setCliente("Cliente 1 (Antônio)");
    conta1.setSaldo(0.0);

    conta2.setNumero("002");
    conta2.setCliente("Cliente 2 (Thiago)");
    conta2.setSaldo(25.0);

    conta3.setNumero("003");
    conta3.setCliente("Cliente 3 (Neto)");
    conta3.setSaldo(1000.0);

    banco.adicionarConta(conta1);
    banco.adicionarConta(conta2);
    banco.adicionarConta(conta3);

    conta1.depositar(100);
    conta2.sacar(50);
    conta3.sacar(200);

    System.out.println("Depósito de 100 na conta " + conta1.getNumero());
    System.out.println("Saque de 50 da conta " + conta2.getNumero());
    System.out.println("Saque de 200 da conta " + conta3.getNumero());

    Conta contaBusca = conta3;
    try {
      Conta contaEncontrada = banco.buscarConta(contaBusca);
      System.out.println(
        "Conta encontrada por objeto Conta: " + contaEncontrada.getCliente()
      );
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    String numeroContaBusca = "004";
    try {
      Conta contaEncontradaPorNumero = banco.buscarContaPorNumero(
        numeroContaBusca
      );
      System.out.println(
        "Conta encontrada por número: " + contaEncontradaPorNumero.getCliente()
      );
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
