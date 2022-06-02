package e2y

import org.gradle.api.Task
import org.gradle.api.logging.LogLevel
import org.gradle.api.tasks.TaskAction

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

class NewTask extends AppendingTask {



    def NewTask(){

        doFirst {print("nanani")}

        PrintingTest()

        println "Before Change loggingLevel"

        LogLevel logLevelBefore = logging.getLevel()
        logging.captureStandardError(LogLevel.LIFECYCLE)

        def variable = System.getenv('HOME')
        println "New One"
        print "docker run image -P"+variable+" -P otro 8080:8080"

        logging.captureStandardOutput(LogLevel.QUIET)
        println "After Change loggingLevel"


    }

    @TaskAction
    def OtherTask(){


        println "Other -- Before Change loggingLevel"

        LogLevel logLevelBefore = logging.getLevel()
        logging.captureStandardOutput(LogLevel.LIFECYCLE)

        def variable = System.getenv('HOME')
        println "Other -- New One"
        print "Other -- docker run image -P"+variable+" -P otro 8080:8080"

        logging.captureStandardOutput(LogLevel.QUIET)
        println "Other -- After Change loggingLevel"


    }

}
