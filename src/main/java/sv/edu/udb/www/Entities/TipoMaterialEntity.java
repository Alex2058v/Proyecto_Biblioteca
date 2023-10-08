package sv.edu.udb.www.Entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "tipo_material", schema = "biblioteca", catalog = "")
public class TipoMaterialEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipo_material", nullable = false)
    private int idTipoMaterial;
    @Basic
    @Column(name = "cod_tipo_material", nullable = false, length = 10)
    private String codTipoMaterial;
    @Basic
    @Column(name = "nombre_material", nullable = false, length = 50)
    private String nombreMaterial;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @OneToMany(mappedBy = "tipoMaterialByTipoMaterial")
    private Collection<MaterialEntity> materialsByIdTipoMaterial;

    public int getIdTipoMaterial() {
        return idTipoMaterial;
    }

    public void setIdTipoMaterial(int idTipoMaterial) {
        this.idTipoMaterial = idTipoMaterial;
    }

    public String getCodTipoMaterial() {
        return codTipoMaterial;
    }

    public void setCodTipoMaterial(String codTipoMaterial) {
        this.codTipoMaterial = codTipoMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
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

        TipoMaterialEntity that = (TipoMaterialEntity) o;

        if (idTipoMaterial != that.idTipoMaterial) return false;
        if (codTipoMaterial != null ? !codTipoMaterial.equals(that.codTipoMaterial) : that.codTipoMaterial != null)
            return false;
        if (nombreMaterial != null ? !nombreMaterial.equals(that.nombreMaterial) : that.nombreMaterial != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoMaterial;
        result = 31 * result + (codTipoMaterial != null ? codTipoMaterial.hashCode() : 0);
        result = 31 * result + (nombreMaterial != null ? nombreMaterial.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    public Collection<MaterialEntity> getMaterialsByIdTipoMaterial() {
        return materialsByIdTipoMaterial;
    }

    public void setMaterialsByIdTipoMaterial(Collection<MaterialEntity> materialsByIdTipoMaterial) {
        this.materialsByIdTipoMaterial = materialsByIdTipoMaterial;
    }
}
