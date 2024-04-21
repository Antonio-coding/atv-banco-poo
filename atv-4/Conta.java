// atv-3\Conta.java

import java.util.Objects;

public class Conta {

  String numero;
  Double saldo;
  String cliente;

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Conta outraConta = (Conta) obj;
    return Objects.equals(numero, outraConta.numero);
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
    } else {
      System.out.println("Valor do depósito deve ser maior que zero.");
    }
  }

  public void sacar(double valor) {
    if (saldo >= valor) {
      saldo -= valor;
      System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
    } else {
      System.out.println("Saldo insuficiente para realizar o saque.");
    }
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
