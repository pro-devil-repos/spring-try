package pro.devil.demo

fun main() {
    val coach: ICoach = TrackCoach()

    println(coach.getDailyWorkout())
}