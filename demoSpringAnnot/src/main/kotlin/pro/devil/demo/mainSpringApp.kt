package pro.devil.demo

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")

    val coachB = context.getBean("baseballCoach", ICoach::class.java)
    val coachT = context.getBean("trackCoach", ICoach::class.java)
    val coachC = context.getBean("cricketCoach", ICoach::class.java)

    println(coachB.getDailyWorkout())
    println(coachT.getDailyWorkout())
    println(coachC.getDailyWorkout())

    context.close()
}