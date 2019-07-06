package com.matt.map;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Author:Created by jiaguofeng on 2019/7/6.
 */
class AlonePlugin implements Plugin<Project> {
     void apply(Project project) {
        note()
        //create an extension object:Whyn,so others can config via Whyn
        project.extensions.create("alone", AloneExtension)
        project.task('alone'){
            group = "test"
            description = "gradle Standalone project demo,shares everywhere"
            doLast{
                println '**************************************'
                println "$project.alone.description"
                println '**************************************'
            }

        }
    }

    private void note(){
        println '------------------------'
        println 'apply StandAlonePlugin'
        println '------------------------'
    }
}

class AloneExtension {
    String description = 'default alone description'
}
