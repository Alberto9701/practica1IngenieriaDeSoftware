package ipn.mx.cerraduraweb.Controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.mvc.support.RedirectAttributes

@Controller
class ViewController {

    @GetMapping("/")
    String mostrarFormulario(Model model) {
        model.addAttribute("mensaje", "Ingrese los datos para aplicar la cerradura de Kleene")
        return "index"  // Esto apunta al archivo index.html en /templates
    }

    @PostMapping("/procesarFormulario")
    String procesarFormulario(@RequestParam("longitud") int longitud, 
                              @RequestParam("opcion") String opcion, 
                              RedirectAttributes redirectAttributes) {
        if (longitud < 0 || (!opcion.equals("estrella") && !opcion.equals("positiva"))) {
            redirectAttributes.addFlashAttribute("error", "Datos inválidos.")
            return "redirect:/"
        }
        return "redirect:/" + opcion + "/" + longitud
    }
}

