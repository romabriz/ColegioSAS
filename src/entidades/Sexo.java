package entidades;

public class Sexo {

    public Sexo() {
    }

    public Sexo(int idsexo) {
        this.idsexo = idsexo;
    }
    
    
    public Sexo(String Sexo) {
        this.tipo = Sexo;
    }
    private int idsexo;
    private String tipo;

    public int getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(int idsexo) {
        this.idsexo = idsexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
