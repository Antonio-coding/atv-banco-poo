package src.entity;

import java.util.Objects;

public class Conta {

  private String numero;
  private double saldo;
  private String cliente;

  public Conta(String numero, double saldo, String cliente) {
    this.numero = numero;
    this.saldo = saldo;
    this.cliente = cliente;
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

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Conta conta = (Conta) o;
    return (
      Double.compare(conta.saldo, saldo) == 0 &&
      numero.equals(conta.numero) &&
      cliente.equals(conta.cliente)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, saldo, cliente);
  }
}
