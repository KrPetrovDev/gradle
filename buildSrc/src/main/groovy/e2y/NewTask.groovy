package e2y

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class NewTask extends DefaultTask {

    @TaskAction
    def generate(){
        def variable = System.getenv('HOME')
        println "New One"
        print variable
    }

}
