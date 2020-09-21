package pro.devil.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
class DemoHibernateApplication

fun main(args: Array<String>) {
    runApplication<DemoHibernateApplication>(*args)
}
