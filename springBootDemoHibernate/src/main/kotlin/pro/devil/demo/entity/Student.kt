package pro.devil.demo.entity

import javax.persistence.*

/**
 * Data-class почему то не рекомендуется использовать с Hibernate
 * надо бы подробнее выяснить почему (что то связано с реализация хеша и equals  в data class
 * что делает невозможным (сложным) использование в Hibernate
 */
@Entity
@Table(name = "student")
class Student(
    @Column(name = "first_name")
    val firstName: String?,
    @Column(name = "last_name")
    val lastName: String?,
    @Column(name = "email")
    val email: String?
) : AbstractJpaPersistable<Long>()