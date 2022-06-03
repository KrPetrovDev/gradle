package e2y

import org.gradle.api.Action
import org.gradle.api.DefaultTask
import org.gradle.api.Task
import org.gradle.api.logging.LogLevel
import org.gradle.api.tasks.TaskAction

import javax.inject.Inject

class AppendingTask extends DefaultTask {

    @Inject
    myNewUsername randomClass;

    def AppendingTask(){
        doFirst {
            randomClass.Name = "Kristian"
            randomClass.Surname = "Petrov"
            randomClass.Data = 32
            print("nanani father")
            print(randomClass.toString())
        }


        println "Before Change loggingLevel Father"

    }

    @Override
    Task doFirst(Action<? super Task> action) {
        return super.doFirst(action)
    }

    @TaskAction
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
