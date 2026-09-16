class Main {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public Main() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    public Main(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public String darHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    
    public String darHora(boolean formato24Horas) {
        if (formato24Horas) {
            return darHora();
        } else {
            int hora12;
            String periodo;
            
            if (hora >= 0 && hora <= 11) {
                hora12 = (hora == 0) ? 12 : hora;
                periodo = "am";
            } else {
                hora12 = (hora == 12) ? 12 : hora - 12;
                periodo = "pm";
            }
            
            return String.format("%02d:%02d:%02d %s", hora12, minuto, segundo, periodo);
        }
    }
    
    @Override
    public String toString() {
        return "Reloj [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
    }
    
    public static void main(String[] args) {
        Main r = new Main(15, 45, 20);
        System.out.println(r.darHora());
        System.out.println(r.darHora(false));
        System.out.println(r.toString());
    }
}