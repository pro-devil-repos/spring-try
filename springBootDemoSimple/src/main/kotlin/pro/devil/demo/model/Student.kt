package pro.devil.demo.model

import org.springframework.stereotype.Component
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Component
data class Student(
    val firstName: String = "",
    @get:NotBlank(message = "is required")
    @get:Size(min = 1, message = "min length is 1")
    val lastName: String = "",
    val country: String = "",
    val language: String = ""
)