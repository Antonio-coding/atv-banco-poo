package corridaDeCavalos;

public class Cavalo implements Runnable {

  private int distanciaDaPassada;
  private int distanciaTotalAPercorrer;

  public Cavalo(int distanciaDaPassada, int distanciaTotalAPercorrer) {
    this.distanciaDaPassada = distanciaDaPassada;
    this.distanciaTotalAPercorrer = distanciaTotalAPercorrer;
  }

  @Override
  public void run() {
    int distanciaPercorrida = 0;
    while (distanciaPercorrida < distanciaTotalAPercorrer) {
      distanciaPercorrida += distanciaDaPassada;
      System.out.println(
        "Cavalo " +
        Thread.currentThread().getName() +
        " percorreu: " +
        distanciaPercorrida +
        " metros"
      );
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(
      "Cavalo " +
      Thread.currentThread().getName() +
      " cruzou a linha de chegada!"
    );
  }
}
