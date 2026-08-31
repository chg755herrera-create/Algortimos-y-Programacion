class Fecha {

    public int mes;
    public int dia;
    public int anio;

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + anio);
    }
}

public class Main {

    public static void main(String[] args) {

        Fecha fecha1 = new Fecha(8, 30, 2026);
        Fecha fecha2 = new Fecha(12, 25, 2026);

        System.out.println("Fecha 1:");
        fecha1.mostrarFecha();

        System.out.println("Fecha 2:");
        fecha2.mostrarFecha();
    }
}