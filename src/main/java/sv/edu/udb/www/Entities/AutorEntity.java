package sv.edu.udb.www.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "autor", schema = "biblioteca", catalog = "")
public class AutorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_autor", nullable = false)
    private int idAutor;
    @Basic
    @Column(name = "nombre_autor", nullable = false, length = 100)
    private String nombreAutor;
    @Basic
    @Column(name = "nacionalidad", nullable = false, length = 100)
    private String nacionalidad;
    @Basic
    @Column(name = "codigo_autor", nullable = false, length = 10)
    private String codigoAutor;

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(String codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutorEntity that = (AutorEntity) o;

        if (idAutor != that.idAutor) return false;
        if (nombreAutor != null ? !nombreAutor.equals(that.nombreAutor) : that.nombreAutor != null) return false;
        if (nacionalidad != null ? !nacionalidad.equals(that.nacionalidad) : that.nacionalidad != null) return false;
        if (codigoAutor != null ? !codigoAutor.equals(that.codigoAutor) : that.codigoAutor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAutor;
        result = 31 * result + (nombreAutor != null ? nombreAutor.hashCode() : 0);
        result = 31 * result + (nacionalidad != null ? nacionalidad.hashCode() : 0);
        result = 31 * result + (codigoAutor != null ? codigoAutor.hashCode() : 0);
        return result;
    }
}
