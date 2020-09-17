package pro.devil.demo.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [CourseCodeConstraintValidator::class])
@Target(AnnotationTarget.FIELD, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class CourseCode(
    val value: String = "LLL",
    val message: String = "must start with LLL",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)