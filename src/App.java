public class App {
    public static void main(String[] args) throws Exception {
    // Primera parte        
        int a;
        int b;
        int c;

        int res = add(a = 1985, b = 1597, c = 1785);

        System.out.println("El resultado de la suma es " + res);

    // Segunda parte
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println("El coche tiene " + miCoche.puertas + " puertas");
    }

    // Primera parte
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

    // Segunda parte
class Coche {
    public int puertas = 2;

    public void addPuerta() {
        this.puertas++;
    }
}
