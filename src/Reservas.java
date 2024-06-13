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

    private void calcularCosto(){

    }
}