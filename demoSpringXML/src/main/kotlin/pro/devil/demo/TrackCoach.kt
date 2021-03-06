package pro.devil.demo

class TrackCoach(private val fortuneService: IFortuneService? = null) : ICoach {

    override fun getDailyWorkout() = "Пробеги много много километров"

    override fun getDailyFortune() = fortuneService?.getFortune() ?: "No fortune"
}