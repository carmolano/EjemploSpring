package mintc.misiontic.ciclo3.controller;





import mintc.misiontic.ciclo3.model.Pais;
import mintc.misiontic.ciclo3.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    private PaisService paisService;


    @GetMapping
    public String listarPais(Model model) {
        model.addAttribute("listaPaises", paisService.listarTodos());
        return "paises/lista";
    }

    @GetMapping("nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("pais", new Pais());
        return "paises/Formulario";
    }

    @PostMapping("/guardar")
    public String guardarPais(@ModelAttribute("pais") Pais pais) {
        paisService.guardar(pais);
        return "redirect:/paises";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Long id, Model model) {
        Pais pais = paisService.obtenerPorId(id);
        if (pais != null) {
            model.addAttribute("pais",pais);
            return "paises/Formulario";
        }
        return "redirect:/paises";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarPais(@PathVariable("id") Long id) {
        paisService.eliminar(id);
        return "redirect:/paises";

 }
}
