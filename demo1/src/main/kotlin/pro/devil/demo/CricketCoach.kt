package pro.devil.demo

class CricketCoach : ICoach {

    lateinit var fortuneService: IFortuneService

    override fun getDailyWorkout() = "Play some cricket!"

    override fun getDailyFortune(): String {
        if (this::fortuneService.isInitialized) {
            return fortuneService.getFortune()
        }

        return "No fortune"
    }
}