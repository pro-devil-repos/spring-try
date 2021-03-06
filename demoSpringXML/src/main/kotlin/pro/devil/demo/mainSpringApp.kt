package pro.devil.demo

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")

    val coach: ICoach = context.getBean("myCoach", ICoach::class.java)

    println(coach.getDailyWorkout())
    println(coach.getDailyFortune())

    val cricketCoach = context.getBean("myCricketCoach", ICoach::class.java)
    println(cricketCoach.getDailyWorkout())
    println(cricketCoach.getDailyFortune())

    context.close()
}