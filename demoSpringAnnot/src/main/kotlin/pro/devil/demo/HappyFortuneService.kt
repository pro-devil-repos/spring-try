package pro.devil.demo

import org.springframework.stereotype.Service

@Service
class HappyFortuneService : IFortuneService {
    override fun getFortune() = "Сегодня твой счастливый день, нуби!"
}