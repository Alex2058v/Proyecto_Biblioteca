package sv.edu.udb.www.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "editorial", schema = "biblioteca", catalog = "")
public class EditorialEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_editorial", nullable = false)
    private int idEditorial;
    @Basic
    @Column(name = "cod_editorial", nullable = false, length = 10)
    private String codEditorial;
    @Basic
    @Column(name = "nombre_editorial", nullable = false, length = 100)
    private String nombreEditorial;
    @Basic
    @Column(name = "contacto", nullable = false, length = 100)
    private String contacto;
    @Basic
    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(String codEditorial) {
        this.codEditorial = codEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EditorialEntity that = (EditorialEntity) o;

        if (idEditorial != that.idEditorial) return false;
        if (codEditorial != null ? !codEditorial.equals(that.codEditorial) : that.codEditorial != null) return false;
        if (nombreEditorial != null ? !nombreEditorial.equals(that.nombreEditorial) : that.nombreEditorial != null)
            return false;
        if (contacto != null ? !contacto.equals(that.contacto) : that.contacto != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEditorial;
        result = 31 * result + (codEditorial != null ? codEditorial.hashCode() : 0);
        result = 31 * result + (nombreEditorial != null ? nombreEditorial.hashCode() : 0);
        result = 31 * result + (contacto != null ? contacto.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        return result;
    }
}
