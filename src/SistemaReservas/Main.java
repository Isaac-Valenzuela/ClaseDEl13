package SistemaReservas;

public class Main {
    public static void main(String [] args){
        Conferencia c1 = new Conferencia(123, "JUAN", "22/22/2024",
                "Conferencia", 1000, 4, 200);

        c1.calcularCosto();
    }
}
