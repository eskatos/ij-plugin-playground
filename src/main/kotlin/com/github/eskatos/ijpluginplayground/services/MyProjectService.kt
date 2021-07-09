package com.github.eskatos.ijpluginplayground.services

import com.github.eskatos.ijpluginplayground.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
