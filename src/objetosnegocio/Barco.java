
package objetosnegocio;

import java.util.Objects;

public class Barco {
    private Integer idbarcos, numAmarre, idsocios;
    private String nombre, matricula, nombreSocio;
    private Float cuota;

    public Barco() {
    }

    public Barco(Integer idbarcos) {
        this.idbarcos = idbarcos;
    }

    public Barco(Integer numAmarre, Integer idsocios, String nombreB, String matricula, Float cuota) {
        this.numAmarre = numAmarre;
        this.idsocios = idsocios;
        this.nombre = nombreB;
        this.matricula = matricula;
        this.cuota = cuota;
    }
    
      public Barco(Integer idbarcos, Integer numAmarre, Integer idsocios, String nombreB, String matricula) {
        this.idbarcos = idbarcos;
        this.numAmarre = numAmarre;
        this.idsocios = idsocios;
        this.nombre = nombreB;
        this.matricula = matricula;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public Integer getIdbarcos() {
        return idbarcos;
    }

    public Integer getNumAmarre() {
        return numAmarre;
    }

    public Integer getIdsocios() {
        return idsocios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public Float getCuota() {
        return cuota;
    }

    public void setIdbarcos(Integer idbarcos) {
        this.idbarcos = idbarcos;
    }

    public void setNumAmarre(Integer numAmarre) {
        this.numAmarre = numAmarre;
    }

    public void setIdsocios(Integer idsocios) {
        this.idsocios = idsocios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCuota(Float cuota) {
        this.cuota = cuota;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.idbarcos);
        hash = 37 * hash + Objects.hashCode(this.numAmarre);
        hash = 37 * hash + Objects.hashCode(this.idsocios);
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.matricula);
        hash = 37 * hash + Objects.hashCode(this.cuota);
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
        final Barco other = (Barco) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.idbarcos, other.idbarcos)) {
            return false;
        }
        if (!Objects.equals(this.numAmarre, other.numAmarre)) {
            return false;
        }
        if (!Objects.equals(this.idsocios, other.idsocios)) {
            return false;
        }
        if (!Objects.equals(this.cuota, other.cuota)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Barco{" + "idbarcos=" + idbarcos + ", numAmarre=" + numAmarre + ", idsocios=" + idsocios + ", nombreB=" + nombre + ", matricula=" + matricula + ", cuota=" + cuota + '}';
    }

    public Object[] toArray(){
        return new Object[]{
            this.getIdbarcos(),
            this.getMatricula(),
            this.getNombre(),
            this.getNumAmarre(),
            this.getCuota(),
            this.getIdsocios(),
            this.getNombreSocio()
        };
    }
    
}
