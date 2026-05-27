package mintc.misiontic.ciclo3.service;




import mintc.misiontic.ciclo3.model.Pais;
import mintc.misiontic.ciclo3.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaisService {



    @Autowired

    private PaisRepository paisRepository;

    public List<Pais> listarTodos() {
        return paisRepository.findAll();
    }

        public void guardar (Pais pais){
            paisRepository.save(pais);
        }

        public Pais obtenerPorId (Long id){
            return paisRepository.findById(id).orElse(null);
        }
        public void eliminar (Long id){
            paisRepository.deleteById(id);


        }


    }

