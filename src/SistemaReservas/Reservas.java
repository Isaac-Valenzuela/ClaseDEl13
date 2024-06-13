package SistemaReservas;

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
        System.out.println("Costo base de SistemaReservas.Conferencia: $1000");
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
        System.out.println("------------------------------------");
    }
}

class Conferencia extends Evento{
    private int numPersonas;
    private int servAdicionalcat;;
    private int costoTotal;

    public Conferencia(int id_reserva, String cliente, String fecha, String tipoevento, int costoevento,
                       int numPersonas, int servAdicionalcat){
        super(id_reserva, cliente, fecha, tipoevento, costoevento);
        this.numPersonas = numPersonas;
        this.servAdicionalcat = servAdicionalcat;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getServAdicionalcat() {
        return servAdicionalcat;
    }

    public void setServAdicionalcat(int servAdicionalcat) {
        this.servAdicionalcat = servAdicionalcat;
    }


    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public void calcularCosto(){
        System.out.println("------------------------------------");
        System.out.println("Reserva de Conferencia:");
        System.out.println("Costo base de SistemaReservas.Conferencia: $1000");
        System.out.println("Equipo audiovisual: $100 adicionales");
        System.out.println("Servicio de catering: $200 adicionales");
        System.out.println("------------------------------------");
        System.out.println("Registro de la reserva:");
        System.out.println("Numero de reserva: " + getId_reserva());
        System.out.println("Nombre del cliente: " + getCliente());
        System.out.println("Fecha de la reserva: " + getFecha());
        System.out.println("Tipo de evento: " + getTipoevento());
        System.out.println("Numero de personas: " + getNumPersonas());
        int a = getCostoevento() + getServAdicionalcat();
        setCostoTotal(a);
        System.out.println("Precio total: " + getCostoTotal());
    }
}
class Boda extends Evento{
    private String Lugar;
    private int servAdicionalMusica;
    private int servAdicionalFlores;
    private int costoTotal;

    public Boda(int id_reserva, String cliente, String fecha, String tipoevento, int costoevento,
                       String lugar, int servAdicionalMusica, int servAdicionalFlores){
        super(id_reserva, cliente, fecha, tipoevento, costoevento);
        this.Lugar = lugar;
        this.servAdicionalMusica = servAdicionalMusica;
        this.servAdicionalFlores = servAdicionalFlores;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public int getServAdicionalMusica() {
        return servAdicionalMusica;
    }

    public int getServAdicionalFlores() {
        return servAdicionalFlores;
    }

    public void setServAdicionalFlores(int servAdicionalFlores) {
        this.servAdicionalFlores = servAdicionalFlores;
    }

    public void setServAdicionalMusica(int servAdicionalMusica) {
        this.servAdicionalMusica = servAdicionalMusica;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public void calcularCosto(){
        System.out.println("------------------------------------");
        System.out.println("Reserva de Boda");
        System.out.println("Costo base de Boda: $2000");
        System.out.println("Decoración floral: $500 adicionales.");
        System.out.println("Música en vivo: $300 adicionales.");
        System.out.println("------------------------------------");
        System.out.println("Registro de la reserva:");
        System.out.println("Numero de reserva: " + getId_reserva());
        System.out.println("Nombre del cliente: " + getCliente());
        System.out.println("Fecha de la reserva: " + getFecha());
        System.out.println("Tipo de evento: " + getTipoevento());
        System.out.println("Luga de recepcion: " + getLugar());
        int a = getCostoevento() + getServAdicionalFlores() + getServAdicionalMusica();
        setCostoTotal(a);
        System.out.println("Precio total: " + getCostoTotal());
    }
}

class Concierto extends Evento{
    private String duracion;
    private int servAdicionalSeguridad;
    private int servAdicionalComida;
    private int costoTotal;

    public Concierto(int id_reserva, String cliente, String fecha, String tipoevento, int costoevento,
                String duracion, int servAdicionalSeguridad, int servAdicionalComida){
        super(id_reserva, cliente, fecha, tipoevento, costoevento);
        this.duracion = duracion;
        this.servAdicionalSeguridad = servAdicionalSeguridad;
        this.servAdicionalComida = servAdicionalComida;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getServAdicionalSeguridad() {
        return servAdicionalSeguridad;
    }

    public void setServAdicionalSeguridad(int servAdicionalSeguridad) {
        this.servAdicionalSeguridad = servAdicionalSeguridad;
    }

    public int getServAdicionalComida() {
        return servAdicionalComida;
    }

    public void setServAdicionalComida(int servAdicionalComida) {
        this.servAdicionalComida = servAdicionalComida;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public void calcularCosto(){
        System.out.println("------------------------------------");
        System.out.println("Reserva de Concierto");
        System.out.println("Costo base de Concierto: $1500");
        System.out.println("Seguridad adicional: $400 adicionales");
        System.out.println("Stand de comida: $150 adicionales.");
        System.out.println("------------------------------------");
        System.out.println("Registro de la reserva:");
        System.out.println("Numero de reserva: " + getId_reserva());
        System.out.println("Nombre del cliente: " + getCliente());
        System.out.println("Fecha de la reserva: " + getFecha());
        System.out.println("Tipo de evento: " + getTipoevento());
        System.out.println("Duracion del concierto: " + getDuracion());
        int a = getCostoevento() + getServAdicionalSeguridad() + getServAdicionalComida();
        setCostoTotal(a);
        System.out.println("Precio total: " + getCostoTotal());
    }
}
