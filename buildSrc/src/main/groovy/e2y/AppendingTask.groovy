package e2y

import org.gradle.api.DefaultTask
import org.gradle.api.logging.LogLevel
import org.gradle.api.tasks.TaskAction

class AppendingTask extends DefaultTask {

    def AppendingTask(){
        doFirst {print("nanani father")}

    }

    def PrintingTest(){
        println "Anywhere -- Before Change loggingLevel"

        LogLevel logLevelBefore = logging.getLevel()
        logging.captureStandardOutput(LogLevel.LIFECYCLE)

        def variable = System.getenv('HOME')
        println "Anywhere -- New One"
        print "Anywhere -- docker run image -P"+variable+" -P otro 8080:8080"

        logging.captureStandardOutput(LogLevel.QUIET)
        println "Anywhere -- After Change loggingLevel"
    }

}
