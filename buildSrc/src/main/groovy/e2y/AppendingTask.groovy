package e2y

import org.gradle.api.DefaultTask
import org.gradle.api.logging.LogLevel

class AppendingTask extends DefaultTask {

    def PrintingTest(){
        println "Anywhere -- Before Change loggingLevel"

        LogLevel logLevelBefore = logging.getLevel()
        logging.captureStandardOutput(LogLevel.LIFECYCLE)

        def variable = System.getenv('HOME')
        println "Anywhere -- New One"
        print "Anywhere -- docker run image -P"+variable+" -P otro 8080:8080"

        logging.captureStandardOutput(logLevelBefore)
        println "Anywhere -- After Change loggingLevel"
    }

}
