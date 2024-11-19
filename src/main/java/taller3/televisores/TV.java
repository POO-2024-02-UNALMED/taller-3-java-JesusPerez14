package taller3.televisores;

public class TV {
    private static int numTV;
    Marca marca;
    private int canal = 1;
    private int volumen = 1;
    private int precio = 500;
    private boolean estado;
    Control control;
    public TV(Marca marca,boolean estado){
        this.marca = marca;
        this.estado = estado;

        numTV++;
    }
    public void volumenUp(){
        if(this.volumen < 7 && this.estado){
            this.volumen++;
        }
    }
    public void volumenDown(){
        if(this.volumen > 0 && this.estado){
            this.volumen--;
        }
    }
    public void canalUp(){
        if(this.canal < 120 && this.estado){
            this.canal++;
        }
    }
    public void canalDown(){
        if(this.canal > 1 && this.estado){
            this.canal--;
        }
    }
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public static int getNumTV() {
        return numTV;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public Marca getMarca(){
        return this.marca;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getCanal(){
        return this.canal;
    }
    public Control getControl(){
        return this.control;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public void setVolumen(int volumen){
        if(this.estado && volumen > 0 && volumen < 7){
            this.volumen = volumen;
        }
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setCanal(int canal){
        if(this.estado && canal <= 120 && canal > 0){
            this.canal = canal;
        }
    }
    public void setControl(Control control){
        this.control = control;
    }
    public static void setNumTV(int numtv){
        numTV = numtv;
    }
}
