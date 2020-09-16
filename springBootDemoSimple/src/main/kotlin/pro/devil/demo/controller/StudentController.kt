package pro.devil.demo.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.propertyeditors.StringTrimmerEditor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.validation.BindingResult
import org.springframework.validation.Errors
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.*
import pro.devil.demo.model.Student
import javax.validation.Valid

@Controller
@RequestMapping("/student")
class StudentController {

    // Добавим initBinder чтобы при валидации все строки триммились
    @InitBinder
    fun initBinder(webDataBinder: WebDataBinder) {
        webDataBinder.registerCustomEditor(String::class.java, StringTrimmerEditor(true))
    }

    @Value("#{\${countries:{:}}}")
    private lateinit var countries: Map<String, String>

    @Value("#{'\${languages}'.split(',')}")
    private lateinit var languages: List<String>

    @GetMapping
    fun showForm(model: Model): String {
        val student = Student()

        model["student"] = student
        model["countries"] = countries
        model["languages"] = languages

        return "student/show-form"
    }

    @PostMapping("/process")
    fun processForm(
        @Valid
        @ModelAttribute
        student: Student,
        errors: Errors, // Бинд ошибок должен быть ПОСЛЕ (СРАЗУ ПОСЛЕ) аттрибута модели, к которому он применяется
        model: Model
    ): String {
        model["student"] = student

        if (errors.hasErrors()) {
            model["countries"] = countries
            model["languages"] = languages
            return "student/show-form"
        }
        model["countryName"] = countries[student.country] ?: "Unknown Country"
        return "student/result-form"
    }
}