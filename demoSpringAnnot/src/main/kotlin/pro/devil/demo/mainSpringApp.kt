package pro.devil.demo

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")

    val coach = context.getBean("baseballCoach", ICoach::class.java)

    println(coach.getDailyWorkout())

    context.close()
}