package e2y

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.logging.LogLevel
import org.gradle.api.tasks.TaskAction

import javax.inject.Inject

class NewTask extends DefaultTask {


    @TaskAction
    def generate(){
        println "Before Change loggingLevel"

        logging.captureStandardOutput(LogLevel.LIFECYCLE)

        def variable = System.getenv('HOME')
        println "New One"
        print "docker run image -P"+variable+" -P otro 8080:8080"

        logging.captureStandardOutput(LogLevel.QUIET)
        println "After Change loggingLevel"


    }

}
