package mintc.misiontic.ciclo3.repository;




import mintc.misiontic.ciclo3.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends  JpaRepository<Pais,Long> {
}
