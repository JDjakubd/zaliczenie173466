import java.util.Scanner;

//Napisz program, który pozwala wprowadzić 5 liczb z klawiatury i znaleźć ich sumę oraz średnią - Program powinien wczytać 5 liczb całkowitych wprowadzonych przez użytkownika.
//   - Obliczyć sumę tych liczb.
//   - Obliczyć średnią arytmetyczną.
//   - Wyświetlić sumę i średnią.
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    for(int i = 0; i<5; i++)
      {
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        sum += liczba;
      }
    double srednia = (double)sum/5;
    System.out.println("Suma: " + sum);
    System.out.println("Srednia: "+ srednia);
    scanner.close();
  }

}