package sv.edu.udb.www.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "material", schema = "biblioteca", catalog = "")
public class MaterialEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_material", nullable = false)
    private int idMaterial;
    @Basic
    @Column(name = "cod_material", nullable = false, length = 10)
    private String codMaterial;
    @Basic
    @Column(name = "tipo_material", nullable = false)
    private int tipoMaterial;
    @Basic
    @Column(name = "nombre_material", nullable = false, length = 100)
    private String nombreMaterial;
    @Basic
    @Column(name = "existencias", nullable = false)
    private int existencias;
    @Basic
    @Column(name = "cod_autor", nullable = false)
    private int codAutor;
    @Basic
    @Column(name = "cod_editorial", nullable = false)
    private int codEditorial;
    @Basic
    @Column(name = "cod_genero", nullable = false)
    private int codGenero;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "cod_autor", referencedColumnName = "id_autor", nullable = false)
    private AutorEntity autorByCodAutor;
    @ManyToOne
    @JoinColumn(name = "cod_editorial", referencedColumnName = "id_editorial", nullable = false)
    private EditorialEntity editorialByCodEditorial;
    @ManyToOne
    @JoinColumn(name = "cod_genero", referencedColumnName = "id_genero", nullable = false)
    private GeneroEntity generoByCodGenero;

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(String codMaterial) {
        this.codMaterial = codMaterial;
    }

    public int getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public int getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }

    public int getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(int codEditorial) {
        this.codEditorial = codEditorial;
    }

    public int getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(int codGenero) {
        this.codGenero = codGenero;
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

        MaterialEntity that = (MaterialEntity) o;

        if (idMaterial != that.idMaterial) return false;
        if (tipoMaterial != that.tipoMaterial) return false;
        if (existencias != that.existencias) return false;
        if (codAutor != that.codAutor) return false;
        if (codEditorial != that.codEditorial) return false;
        if (codGenero != that.codGenero) return false;
        if (codMaterial != null ? !codMaterial.equals(that.codMaterial) : that.codMaterial != null) return false;
        if (nombreMaterial != null ? !nombreMaterial.equals(that.nombreMaterial) : that.nombreMaterial != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMaterial;
        result = 31 * result + (codMaterial != null ? codMaterial.hashCode() : 0);
        result = 31 * result + tipoMaterial;
        result = 31 * result + (nombreMaterial != null ? nombreMaterial.hashCode() : 0);
        result = 31 * result + existencias;
        result = 31 * result + codAutor;
        result = 31 * result + codEditorial;
        result = 31 * result + codGenero;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    public AutorEntity getAutorByCodAutor() {
        return autorByCodAutor;
    }

    public void setAutorByCodAutor(AutorEntity autorByCodAutor) {
        this.autorByCodAutor = autorByCodAutor;
    }

    public EditorialEntity getEditorialByCodEditorial() {
        return editorialByCodEditorial;
    }

    public void setEditorialByCodEditorial(EditorialEntity editorialByCodEditorial) {
        this.editorialByCodEditorial = editorialByCodEditorial;
    }

    public GeneroEntity getGeneroByCodGenero() {
        return generoByCodGenero;
    }

    public void setGeneroByCodGenero(GeneroEntity generoByCodGenero) {
        this.generoByCodGenero = generoByCodGenero;
    }
}
