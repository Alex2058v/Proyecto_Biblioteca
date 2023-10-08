package sv.edu.udb.www.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "genero", schema = "biblioteca", catalog = "")
public class GeneroEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_genero", nullable = false)
    private int idGenero;
    @Basic
    @Column(name = "cod_genero", nullable = false, length = 10)
    private String codGenero;
    @Basic
    @Column(name = "nombre_genero", nullable = false, length = 50)
    private String nombreGenero;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(String codGenero) {
        this.codGenero = codGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneroEntity that = (GeneroEntity) o;

        if (idGenero != that.idGenero) return false;
        if (codGenero != null ? !codGenero.equals(that.codGenero) : that.codGenero != null) return false;
        if (nombreGenero != null ? !nombreGenero.equals(that.nombreGenero) : that.nombreGenero != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGenero;
        result = 31 * result + (codGenero != null ? codGenero.hashCode() : 0);
        result = 31 * result + (nombreGenero != null ? nombreGenero.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
