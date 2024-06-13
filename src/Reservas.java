import javax.naming.spi.ResolveResult;

public class Reservas{
    private int id_reserva;
    private String cliente;
    private String fecha;


    public Reservas(int id_reserva, String cliente, String fecha){
        this.id_reserva = id_reserva;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void calcularCosto(){
    }
}

class Evento extends Reservas{
    private String tipoevento;
    private int costoevento;

    public Evento(int id_reserva, String cliente, String fecha, String tipoevento, int costoevento ){
        super(id_reserva, cliente, fecha);
        this.tipoevento = tipoevento;
        this.costoevento = costoevento;
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(String tipoevento) {
        this.tipoevento = tipoevento;
    }

    public int getCostoevento() {
        return costoevento;
    }

    public void setCostoevento(int costoevento) {
        this.costoevento = costoevento;
    }

    @Override
    public void calcularCosto(){
        System.out.println("------------------------------------");
        System.out.println("Reserva de Conferencia:");
        System.out.println("Costo base de Conferencia: $1000");
        System.out.println("Equipo audiovisual: $100 adicionales");
        System.out.println("Servicio de catering: $200 adicionales");
        System.out.println("------------------------------------");
        System.out.println("Reserva de Boda");
        System.out.println("Costo base de Boda: $2000");
        System.out.println("Decoración floral: $500 adicionales.");
        System.out.println("Música en vivo: $300 adicionales.");
        System.out.println("------------------------------------");
        System.out.println("Reserva de Concierto");
        System.out.println("Costo base de Concierto: $1500");
        System.out.println("Seguridad adicional: $400 adicionales");
        System.out.println("Stand de comida: $150 adicionales.");
    }
}

class Conferencia extends