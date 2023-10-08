package sv.edu.udb.www.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "prestamos", schema = "biblioteca", catalog = "")
public class PrestamosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_prestamo", nullable = false)
    private int idPrestamo;
    @Basic
    @Column(name = "cod_prestamo", nullable = false, length = 10)
    private String codPrestamo;
    @Basic
    @Column(name = "id_estudiante", nullable = false)
    private int idEstudiante;
    @Basic
    @Column(name = "id_empleado", nullable = false)
    private int idEmpleado;
    @Basic
    @Column(name = "id_material", nullable = false)
    private int idMaterial;
    @Basic
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;
    @Basic
    @Column(name = "fecha_limite", nullable = false)
    private Date fechaLimite;
    @Basic
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Basic
    @Column(name = "id_multa", nullable = false)
    private int idMulta;
    @ManyToOne
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id_estudiante", nullable = false)
    private EstudiantesEntity estudiantesByIdEstudiante;
    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado", nullable = false)
    private EmpleadosEntity empleadosByIdEmpleado;
    @ManyToOne
    @JoinColumn(name = "id_material", referencedColumnName = "id_material", nullable = false)
    private MaterialEntity materialByIdMaterial;
    @ManyToOne
    @JoinColumn(name = "id_multa", referencedColumnName = "id_multas", nullable = false)
    private MultasEntity multasByIdMulta;

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getCodPrestamo() {
        return codPrestamo;
    }

    public void setCodPrestamo(String codPrestamo) {
        this.codPrestamo = codPrestamo;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrestamosEntity that = (PrestamosEntity) o;

        if (idPrestamo != that.idPrestamo) return false;
        if (idEstudiante != that.idEstudiante) return false;
        if (idEmpleado != that.idEmpleado) return false;
        if (idMaterial != that.idMaterial) return false;
        if (cantidad != that.cantidad) return false;
        if (idMulta != that.idMulta) return false;
        if (codPrestamo != null ? !codPrestamo.equals(that.codPrestamo) : that.codPrestamo != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaLimite != null ? !fechaLimite.equals(that.fechaLimite) : that.fechaLimite != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrestamo;
        result = 31 * result + (codPrestamo != null ? codPrestamo.hashCode() : 0);
        result = 31 * result + idEstudiante;
        result = 31 * result + idEmpleado;
        result = 31 * result + idMaterial;
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaLimite != null ? fechaLimite.hashCode() : 0);
        result = 31 * result + cantidad;
        result = 31 * result + idMulta;
        return result;
    }

    public EstudiantesEntity getEstudiantesByIdEstudiante() {
        return estudiantesByIdEstudiante;
    }

    public void setEstudiantesByIdEstudiante(EstudiantesEntity estudiantesByIdEstudiante) {
        this.estudiantesByIdEstudiante = estudiantesByIdEstudiante;
    }

    public EmpleadosEntity getEmpleadosByIdEmpleado() {
        return empleadosByIdEmpleado;
    }

    public void setEmpleadosByIdEmpleado(EmpleadosEntity empleadosByIdEmpleado) {
        this.empleadosByIdEmpleado = empleadosByIdEmpleado;
    }

    public MaterialEntity getMaterialByIdMaterial() {
        return materialByIdMaterial;
    }

    public void setMaterialByIdMaterial(MaterialEntity materialByIdMaterial) {
        this.materialByIdMaterial = materialByIdMaterial;
    }

    public MultasEntity getMultasByIdMulta() {
        return multasByIdMulta;
    }

    public void setMultasByIdMulta(MultasEntity multasByIdMulta) {
        this.multasByIdMulta = multasByIdMulta;
    }
}
