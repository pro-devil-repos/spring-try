package pro.devil.demo

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import pro.devil.demo.config.AppConfiguration

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfiguration::class.java)


    val coachB = context.getBean("baseballCoach", ICoach::class.java)
    val coachT = context.getBean("trackCoach", ICoach::class.java)
    val coachC = context.getBean("cricketCoach", ICoach::class.java)

    println(coachB.getDailyWorkout())
    println(coachB.getDailyFortune())
    println(coachT.getDailyWorkout())
    println(coachT.getDailyFortune())
    println(coachC.getDailyWorkout())
    println(coachC.getDailyFortune())

    context.close()
}