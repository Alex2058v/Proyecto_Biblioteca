package sv.edu.udb.www.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes", schema = "biblioteca", catalog = "")
public class EstudiantesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_estudiante", nullable = false)
    private int idEstudiante;
    @Basic
    @Column(name = "cod_estudiantes", nullable = false, length = 10)
    private String codEstudiantes;
    @Basic
    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;
    @Basic
    @Column(name = "dui", nullable = false, length = 10)
    private String dui;
    @Basic
    @Column(name = "direccion", nullable = false, length = 400)
    private String direccion;
    @Basic
    @Column(name = "correo", nullable = false, length = 100)
    private String correo;
    @Basic
    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;
    @Basic
    @Column(name = "carrera", nullable = false, length = 200)
    private String carrera;
    @Basic
    @Column(name = "password", nullable = false, length = 50)
    private String password;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCodEstudiantes() {
        return codEstudiantes;
    }

    public void setCodEstudiantes(String codEstudiantes) {
        this.codEstudiantes = codEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstudiantesEntity that = (EstudiantesEntity) o;

        if (idEstudiante != that.idEstudiante) return false;
        if (codEstudiantes != null ? !codEstudiantes.equals(that.codEstudiantes) : that.codEstudiantes != null)
            return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (dui != null ? !dui.equals(that.dui) : that.dui != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (correo != null ? !correo.equals(that.correo) : that.correo != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (carrera != null ? !carrera.equals(that.carrera) : that.carrera != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEstudiante;
        result = 31 * result + (codEstudiantes != null ? codEstudiantes.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (dui != null ? dui.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (correo != null ? correo.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (carrera != null ? carrera.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
