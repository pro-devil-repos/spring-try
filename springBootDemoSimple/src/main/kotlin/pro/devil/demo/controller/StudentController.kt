package pro.devil.demo.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*
import pro.devil.demo.model.Student

@Controller
@RequestMapping("/student")
class StudentController {

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
    fun processForm(student: Student, model: Model): String {
        model["student"] = student
        model["countryName"] = countries[student.country] ?: "Unknown Country"
        return "student/result-form"
    }
}