package pro.devil.demo.utils

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.util.logging.ConsoleHandler
import java.util.logging.Level
import java.util.logging.Logger
import java.util.logging.SimpleFormatter

class MyLoggerConfig {

    lateinit var rootLoggerLevel: String
    lateinit var printedLoggerLevel: String

    fun initLogger() {
        // Parse Levels
        val rootLevel = Level.parse(rootLoggerLevel)
        val printedLevel = Level.parse(printedLoggerLevel)

        // Get Logger for app context
        val applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext::class.java.name)

        // Get parent Logger and set log-level
        val loggerParent = applicationContextLogger.parent
        loggerParent.level = rootLevel

        // Set-up console header
        val consoleHandler = ConsoleHandler()
        consoleHandler.level = printedLevel
        consoleHandler.formatter = SimpleFormatter()

        // Add handler to the logger
        loggerParent.addHandler(consoleHandler)
    }
}