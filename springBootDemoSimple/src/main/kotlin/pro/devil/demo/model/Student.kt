package pro.devil.demo.model

import org.springframework.stereotype.Component
import pro.devil.demo.validation.CourseCode
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Component
data class Student(
    val firstName: String = "",
    @field:NotBlank(message = "is required")
    @field:Size(min = 1, message = "min length is 1")
    val lastName: String = "",
    val country: String = "",
    val language: String = "",
    @field:CourseCode("RUS", "must start with RUS")
    val courseCode: String = ""
)