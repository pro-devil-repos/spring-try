package pro.devil.demo.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import java.util.logging.ConsoleHandler
import java.util.logging.Level
import java.util.logging.Logger
import java.util.logging.SimpleFormatter
import javax.annotation.PostConstruct

@Configuration
@PropertySource("classpath:myLogger.properties")
open class MyLoggerConfiguration {

    @Value("\${root.logger.level}")
    private lateinit var rootLevelLogger: String

    @Value("\${printed.logger.level}")
    private lateinit var printedLevelLogger: String

    @PostConstruct
    fun initLogger() {
        // parse levels
        val rootLevel = Level.parse(rootLevelLogger)
        val printedLevel = Level.parse(printedLevelLogger)

        // get logger for app context
        val applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext::class.java.name)

        // get parent logger
        val loggerParent = applicationContextLogger.parent
        // set root logging level
        loggerParent.level = rootLevel

        // set up console handler
        val consoleHandler = ConsoleHandler()
        consoleHandler.level = printedLevel
        consoleHandler.formatter = SimpleFormatter()

        loggerParent.addHandler(consoleHandler)
    }
}