package actions

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class CheckVersionToolbarAction: AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val notification = NotificationGroup("", NotificationDisplayType.BALLOON, true)
        notification.createNotification("KotDoc",
            "KotDoc version 1.0 is running",
            NotificationType.INFORMATION,
            null
        ).notify(e.project)
    }
}