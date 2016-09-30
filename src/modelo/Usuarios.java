/*
 * -------------------------------------------------
 * alphaDev - Desenvolvimento de Projetos Sistêmicos
 * -------------------------------------------------
 */
package modelo;

import java.io.Serializable;
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
  @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
  @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.id = :id"),
  @NamedQuery(name = "Usuarios.findByNome", query = "SELECT u FROM Usuarios u WHERE u.nome = :nome"),
  @NamedQuery(name = "Usuarios.findByNivel", query = "SELECT u FROM Usuarios u WHERE u.nivel = :nivel"),
  @NamedQuery(name = "Usuarios.findByUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario"),
  @NamedQuery(name = "Usuarios.findBySenha", query = "SELECT u FROM Usuarios u WHERE u.senha = :senha"),
  @NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email"),
  @NamedQuery(name = "Usuarios.findByTema", query = "SELECT u FROM Usuarios u WHERE u.tema = :tema"),
  @NamedQuery(name = "Usuarios.findByCreateAt", query = "SELECT u FROM Usuarios u WHERE u.createAt = :createAt"),
  @NamedQuery(name = "Usuarios.findByUpdateAt", query = "SELECT u FROM Usuarios u WHERE u.updateAt = :updateAt"),
  @NamedQuery(name = "Usuarios.findByDeleteAt", query = "SELECT u FROM Usuarios u WHERE u.deleteAt = :deleteAt"),
  @NamedQuery(name = "Usuarios.findByUsuarioESenha", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario AND u.senha = :senha")})

public class Usuarios implements Serializable {

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
  @Column(nullable = false, length = 20)
  private String nivel;

  @Basic(optional = false)
  @Column(nullable = false, length = 20)
  private String usuario;

  @Basic(optional = false)
  @Column(nullable = false, length = 15)
  private String senha;

  @Basic(optional = false)
  @Column(nullable = false, length = 50)
  private String email;

  @Basic(optional = false)
  @Column(nullable = false, length = 50)
  private String tema;

  @Column(name = "create_at")
  @Temporal(TemporalType.TIMESTAMP)
  private Date createAt;

  @Column(name = "update_at")
  @Temporal(TemporalType.TIMESTAMP)
  private Date updateAt;

  @Column(name = "delete_at")
  @Temporal(TemporalType.TIMESTAMP)
  private Date deleteAt;

  public Usuarios() {
  }

  public Usuarios( Integer id ) {
    this.id = id;
  }

  public Usuarios( Integer id, String nome, String nivel, String usuario, String senha, String email, String tema ) {
    this.id = id;
    this.nome = nome;
    this.nivel = nivel;
    this.usuario = usuario;
    this.senha = senha;
    this.email = email;
    this.tema = tema;
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

  public String getNivel() {
    return nivel;
  }

  public void setNivel( String nivel ) {
    this.nivel = nivel;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario( String usuario ) {
    this.usuario = usuario;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha( String senha ) {
    this.senha = senha;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail( String email ) {
    this.email = email;
  }

  public String getTema() {
    return tema;
  }

  public void setTema( String tema ) {
    this.tema = tema;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt( Date createAt ) {
    this.createAt = createAt;
  }

  public Date getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt( Date updateAt ) {
    this.updateAt = updateAt;
  }

  public Date getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt( Date deleteAt ) {
    this.deleteAt = deleteAt;
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
    if ( !(object instanceof Usuarios) ) {
      return false;
    }
    Usuarios other = (Usuarios) object;
    if ( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "modelo.Usuarios[ id=" + id + " ]";
  }

}
