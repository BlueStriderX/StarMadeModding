package com.github.bluestriderx.starmademodding.services

import com.intellij.openapi.project.Project
import com.github.bluestriderx.starmademodding.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
