package com.github.teodossidossev.committemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.teodossidossev.committemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
