package SistemaReservas;

public class Main {
    public static void main(String [] args){
        Conferencia c1 = new Conferencia(123, "JUAN", "22/22/2024",
                "Conferencia", 1000, 4, 200);

        c1.calcularCosto();
        Boda b1 = new Boda(123,"PEPE", "22/11/2029",
                "Boda", 2000, "Cutuglagua", 300, 500 );

        b1.calcularCosto();
        Concierto co1 = new Concierto(123,"Juanito Perez", "22/22/2050",
                "Concierto", 1500, "3 horas", 400, 150);

        co1.calcularCosto();
        //Menaje
    }
}
