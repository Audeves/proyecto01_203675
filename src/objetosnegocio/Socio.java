package objetosnegocio;

import java.util.Objects;

public class Socio {
    private Integer id;
    private String nombre;
    private String curp;

    public Socio() {}

    public Socio(Integer id) {
        this.id = id;
    }

    public Socio(String nombre, String curp) {
        this.nombre = nombre;
        this.curp = curp;
    }        
    
    public Socio(Integer id, String nombre, String curp) {
        this.id = id;
        this.nombre = nombre;
        this.curp = curp;
    }   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }     
    
    public Object[] toArray(){
        return new Object[]{
            this.getId(),
            this.getNombre(),
            this.getCurp()
        };
    }
}
