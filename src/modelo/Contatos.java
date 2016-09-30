/*
 * -------------------------------------------------
 * alphaDev - Desenvolvimento de Projetos Sistêmicos
 * -------------------------------------------------
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fernando
 */
@Entity
@Table(catalog = "db_fatec", schema = "")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Contatos.findAll", query = "SELECT c FROM Contatos c"),
  @NamedQuery(name = "Contatos.findById", query = "SELECT c FROM Contatos c WHERE c.id = :id"),
  @NamedQuery(name = "Contatos.findByNome", query = "SELECT c FROM Contatos c WHERE c.nome = :nome"),
  @NamedQuery(name = "Contatos.findBySexo", query = "SELECT c FROM Contatos c WHERE c.sexo = :sexo"),
  @NamedQuery(name = "Contatos.findByFoneRes", query = "SELECT c FROM Contatos c WHERE c.foneRes = :foneRes"),
  @NamedQuery(name = "Contatos.findByFoneCel", query = "SELECT c FROM Contatos c WHERE c.foneCel = :foneCel"),
  @NamedQuery(name = "Contatos.findByEmail", query = "SELECT c FROM Contatos c WHERE c.email = :email"),
  @NamedQuery(name = "Contatos.findByDataNas", query = "SELECT c FROM Contatos c WHERE c.dataNas = :dataNas"),
  @NamedQuery(name = "Contatos.findBySalario", query = "SELECT c FROM Contatos c WHERE c.salario = :salario")})
public class Contatos implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(nullable = false)
  private Integer id;
  @Basic(optional = false)
  @Column(nullable = false, length = 40)
  private String nome;
  @Basic(optional = false)
  @Column(nullable = false, length = 1)
  private String sexo;
  @Column(name = "fone_res", length = 15)
  private String foneRes;
  @Column(name = "fone_cel", length = 15)
  private String foneCel;
  @Basic(optional = false)
  @Column(nullable = false, length = 50)
  private String email;
  @Column(name = "data_nas")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dataNas;
  // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  @Column(precision = 10, scale = 2)
  private BigDecimal salario;

  public Contatos() {
  }

  public Contatos( Integer id ) {
    this.id = id;
  }

  public Contatos( Integer id, String nome, String sexo, String email ) {
    this.id = id;
    this.nome = nome;
    this.sexo = sexo;
    this.email = email;
  }

  public Integer getId() {
    return id;
  }

  public void setId( Integer id ) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome( String nome ) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo( String sexo ) {
    this.sexo = sexo;
  }

  public String getFoneRes() {
    return foneRes;
  }

  public void setFoneRes( String foneRes ) {
    this.foneRes = foneRes;
  }

  public String getFoneCel() {
    return foneCel;
  }

  public void setFoneCel( String foneCel ) {
    this.foneCel = foneCel;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail( String email ) {
    this.email = email;
  }

  public Date getDataNas() {
    return dataNas;
  }

  public void setDataNas( Date dataNas ) {
    this.dataNas = dataNas;
  }

  public BigDecimal getSalario() {
    return salario;
  }

  public void setSalario( BigDecimal salario ) {
    this.salario = salario;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals( Object object ) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if ( !(object instanceof Contatos) ) {
      return false;
    }
    Contatos other = (Contatos) object;
    if ( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "modelo.Contatos[ id=" + id + " ]";
  }

}
