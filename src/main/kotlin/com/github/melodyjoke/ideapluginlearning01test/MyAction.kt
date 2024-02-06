package com.github.melodyjoke.ideapluginlearning01test

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.ui.Messages

class MyAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val project = event.getData(PlatformDataKeys.PROJECT)
        val psiFile = event.getData(CommonDataKeys.PSI_FILE)

        val projectName = project?.name
        val classPath = psiFile?.virtualFile?.path

        Messages.showMessageDialog(project, "$projectName: $classPath", "Hello IDEA Plugin", Messages.getInformationIcon())
    }
}
