public class metodo {
    public int[][] llenarMatrizEntera(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return m;
    }

    public void mostrarMatrizEntera(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(" -" + m[i][j]);
            }
            System.out.println();
        }
    }

    public ObjMatriz[][] llenarMatrizObjetual(ObjMatriz[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                ObjMatriz o = new ObjMatriz();
                o.setDato((int) (Math.random() * 50 + 1));
                m[i][j] = o;
            }
        }
        return m;
    }

    public void mostrarMatrizObjetual(ObjMatriz[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(" - " + m[i][j].getDato());
            }
            System.out.println();
        }
    }

    public void mostrarDiagonalMatrizObjetual(ObjMatriz[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    System.out.print(" - " + m[i][j].getDato());
                } else {
                    System.out.print(" - ");
                }
        }
        System.out.println();
    }
    }

    public void mostrarNumerosImparesMatrizObjetual(ObjMatriz[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].getDato() % 2 != 0) {
                    System.out.print(" - " + m[i][j].getDato());
                } else {
                    System.out.print(" - ");

                }
    }
    System.out.println();
}
    }
}