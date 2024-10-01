package ipn.mx.cerraduraweb.Controller

import ipn.mx.cerraduraweb.Model.CerraduraKleene
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import org.springframework.web.bind.annotation.PathVariable

@Controller
class KleeneController {

    @GetMapping("/{opcion}/{longitud}")
    String mostrarResultado(@PathVariable("opcion") String opcion, @PathVariable("longitud") int longitud, Model model, RedirectAttributes redirectAttributes) {
        CerraduraKleene cerraduraKleene = new CerraduraKleene()
        String resultado = cerraduraKleene.aplicarCerraduraKleene(opcion, longitud)
        model.addAttribute("resultado", resultado)
        model.addAttribute("opcion", opcion)
        model.addAttribute("longitud",longitud)
        return "resultado" // Crea una vista resultado.html para mostrar el resultado
    }
}