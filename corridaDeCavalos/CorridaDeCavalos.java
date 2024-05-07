package corridaDeCavalos;

import java.util.Scanner;

public class CorridaDeCavalos {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de cavalos: ");
    int numeroDeCavalos = scanner.nextInt();

    System.out.print("Digite a distância da corrida (em metros): ");
    int distanciaTotal = scanner.nextInt();

    System.out.print(
      "Digite o tamanho da passada de cada cavalo (em metros): "
    );
    int distanciaDaPassada = scanner.nextInt();

    for (int i = 1; i <= numeroDeCavalos; i++) {
      Cavalo cavalo = new Cavalo(distanciaDaPassada, distanciaTotal);
      Thread threadCavalo = new Thread(cavalo, "Cavalo_" + i);
      threadCavalo.start();
    }

    scanner.close();
  }
}
