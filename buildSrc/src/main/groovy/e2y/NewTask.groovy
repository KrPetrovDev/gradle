package e2y

import org.gradle.api.logging.LogLevel
import org.gradle.api.tasks.TaskAction

class NewTask extends AppendingTask {


    @TaskAction
    def generate(){

        PrintingTest()

        println "Before Change loggingLevel"

        LogLevel logLevelBefore = logging.getLevel()
        logging.captureStandardOutput(LogLevel.LIFECYCLE)

        def variable = System.getenv('HOME')
        println "New One"
        print "docker run image -P"+variable+" -P otro 8080:8080"

        logging.captureStandardOutput(LogLevel.QUIET)
        println "After Change loggingLevel"


    }

}
