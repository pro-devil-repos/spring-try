package pro.devil.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping("/")
    fun showPage(): String {
        return "main-menu"
    }

    @GetMapping("/showStatic")
    fun showStatic(): String {
        return "show-static"
    }
}