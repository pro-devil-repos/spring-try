package pro.devil.demo.repository

import org.springframework.data.jpa.repository.JpaRepository
import pro.devil.demo.entity.Student

interface StudentRepository : JpaRepository<Student, Long> {
}