package actions

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class ActionHandler : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val notification = NotificationGroup("myplugin", NotificationDisplayType.BALLOON, true)
        notification.createNotification("My Title",
            "My Message",
            NotificationType.INFORMATION,
            null
        ).notify(e.project)
    }
}