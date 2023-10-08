package sv.edu.udb.www.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "multas", schema = "biblioteca", catalog = "")
public class MultasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_multas", nullable = false)
    private int idMultas;
    @Basic
    @Column(name = "cod_multa", nullable = false, length = 10)
    private String codMulta;
    @Basic
    @Column(name = "monto", nullable = false)
    private int monto;
    @Basic
    @Column(name = "estado_multa", nullable = false, length = 50)
    private String estadoMulta;

    public int getIdMultas() {
        return idMultas;
    }

    public void setIdMultas(int idMultas) {
        this.idMultas = idMultas;
    }

    public String getCodMulta() {
        return codMulta;
    }

    public void setCodMulta(String codMulta) {
        this.codMulta = codMulta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getEstadoMulta() {
        return estadoMulta;
    }

    public void setEstadoMulta(String estadoMulta) {
        this.estadoMulta = estadoMulta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MultasEntity that = (MultasEntity) o;

        if (idMultas != that.idMultas) return false;
        if (monto != that.monto) return false;
        if (codMulta != null ? !codMulta.equals(that.codMulta) : that.codMulta != null) return false;
        if (estadoMulta != null ? !estadoMulta.equals(that.estadoMulta) : that.estadoMulta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMultas;
        result = 31 * result + (codMulta != null ? codMulta.hashCode() : 0);
        result = 31 * result + monto;
        result = 31 * result + (estadoMulta != null ? estadoMulta.hashCode() : 0);
        return result;
    }
}
