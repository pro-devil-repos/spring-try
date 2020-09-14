package pro.devil.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping("/forms")
class TryFormsController {

    @GetMapping("/")
    fun showForm(): String {
        return "show-form"
    }

    @PostMapping("/process")
    fun processForm(model: Model, @RequestParam studentName: String): String {
        model["student"] = studentName.toUpperCase()
        return "show-form-result"
    }
}