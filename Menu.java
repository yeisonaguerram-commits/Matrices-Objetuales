import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        metodo m = new metodo();
        int n = 0;
        System.out.println("Ingrese el tamaño de la matriz");
        n = sc.nextInt();
        int[][] ME = new int[n][n];
        ObjMatriz[][] MO = new ObjMatriz[n][n];
        while (continuar) {
            System.out.println("1. Llenar Matriz de enteros");
            System.out.println("2. Mostrar Matriz de enteros");
            System.out.println("3. Llenar Matriz Objetual");
            System.out.println("4. Mostrar Matriz Objetual");
            System.out.println("5. Mostrar Diagonal Matriz Objetual");
            System.out.println("6. Mostrar Números Impares Matriz Objetual");
            System.out.println("7. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ME = m.llenarMatrizEntera(ME);
                    break;
                case 2:
                    m.mostrarMatrizEntera(ME);
                    break;
                case 3:
                    MO = m.llenarMatrizObjetual(MO);
                    break;
                case 4:
                    m.mostrarMatrizObjetual(MO);
                    break;
                case 5:
                    m.mostrarDiagonalMatrizObjetual(MO);
                    break;
                case 6:
                    m.mostrarNumerosImparesMatrizObjetual(MO);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        sc.close();
    }
}
