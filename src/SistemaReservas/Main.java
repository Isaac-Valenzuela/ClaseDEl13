package SistemaReservas;

public class Main {
    public static void main(String [] args){
        System.out.println("-------------------------");
        System.out.println("Con servicios adicionales");
        Conferencia c1 = new Conferencia(123, "JUAN", "22/22/2024",
                "Conferencia", 1000, 4, 200);

        c1.calcularCosto();
        Boda b1 = new Boda(123,"PEPE", "22/11/2029",
                "Boda", 2000, "Cutuglagua", 300, 500 );

        b1.calcularCosto();
        Concierto co1 = new Concierto(123,"Juanito Perez", "22/22/2050",
                "Concierto", 1500, "3 horas", 400, 150);

        co1.calcularCosto();

        System.out.println("-------------------------");
        System.out.println("Con servicios adicionales");
        Conferencia c2 = new Conferencia(123, "Dannilo", "22/22/2024",
                "Conferencia", 1000, 4, 0);

        c2.calcularCosto();
        Boda b2 = new Boda(123,"Titosss", "22/11/2029",
                "Boda", 2000, "Valle", 0, 0 );

        b2.calcularCosto();
        Concierto co2 = new Concierto(123,"Perez Juanito", "22/22/2050",
                "Concierto", 1500, "3 horas", 0, 0);

        co2.calcularCosto();

    }
}
