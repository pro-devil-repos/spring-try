package pro.devil.demo.model

import org.springframework.stereotype.Component

@Component
data class Student(
    val firstName: String = "",
    val lastName: String = "",
    val country: String = "",
    val language: String = ""
)