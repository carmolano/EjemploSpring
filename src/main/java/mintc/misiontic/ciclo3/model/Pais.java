package mintc.misiontic.ciclo3.model;

import jakarta.persistence.*;


@Entity
@Table(name = "paises")
public class Pais {

@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long   id;
    private String nombre;
    private String presidente;
    private String continente;

    @Column(name = "nombre_himno")
private  String  nombreHimno;
    @Column(name = "num_habitantes")
private  Long  numHabitantes;
    @Column(name = "num_departamentos")
private  Integer numDepartamentos;
    @Column(name = "num_Municipio")
private  Integer numMunicipios;
    @Column(name = "idioma_Principal")
private  String  idiomaPrincipal;
    @Column(name = "num_Universidad")
private  Integer numUniversidades;
    @Column(name = "tipo_Democracia")
private  String  tipoDemocracia;


public Pais(){

}
public Long getId() { return id;}
    public void setId(Long id) {
        this.id = id;
    }

public String getNombre() { return nombre; }
public void setNombre(String nombre){this.nombre = nombre;}

public String getPresidente() {return presidente;}
public void  setPresidente (String presidente){this.presidente = presidente;}

public String getContinente () {return continente;}
public void setContinente (String continente) {this.continente = continente;}

public String getNombreHimno() {return nombreHimno;}
    public void setNombreHimno(String nombreHimno) {this.nombreHimno = nombreHimno;}

public Long getNumHabitantes() {return numHabitantes;}
public void setNumHabitantes(Long numHabitantes){this.numHabitantes = numHabitantes;}

public Integer getNumDepartamentos(){ return numDepartamentos;}
    public void setNumDepartamentos(Integer numDepartamentos){ this.numDepartamentos = numDepartamentos;}


public  Integer getNumMunicipios(){return numMunicipios;}
public void setNumMunicipios(Integer numMunicipios ) {this.numMunicipios = numMunicipios;}


public String getIdiomaPrincipal(){ return idiomaPrincipal;}
public void setIdiomaPrincipal(String idiomaPrincipal){this.idiomaPrincipal= idiomaPrincipal;}


 public Integer getNumUniversidades(){ return numUniversidades;}
 public void setNumUniversidades(Integer numUniversidades){this.numUniversidades = numUniversidades;}


    public String getTipoDemocracia (){return tipoDemocracia;}
    public void setTipoDemocracia (String tipoDemocracia) {this.tipoDemocracia = tipoDemocracia;}

}
