package com.github.linuxchina.intellijplatformplugin.services

import com.github.linuxchina.intellijplatformplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
