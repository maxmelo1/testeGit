package testegit;

/**
 *
 * @author Maximillian de melo
 */
public class TesteGit {
//Hello There
    
        public int mdc(int x, int y) {
        int n = 2, maior = 0, resultado = 1;

        if (x > y) {
            maior = x;
        } else if (x < y) {
            maior = y;
        } else {
            maior = x;
        }
        while (n <= maior) {

            if ((x % n == 0) && (y % n == 0)) {

                x = x / n;
                y = y / n;

                resultado *= n;

            }
            if (!((x % n == 0) && (y % n == 0))) {
                n++;
            }
        }
        return resultado;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("to CAGADO DE FOME!!");
        //meu deus do céu
    }
    
}
