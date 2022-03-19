package pl.otros.logview.scala

import pl.otros.logview.api.pluginable.MessageFormatter

class CaseClassFormatter  extends MessageFormatter {
  override def getName: String = "Case class formatter"

  override def getPluginableId: String = this.getClass.getName

  override def getDescription: String = "Formatting scala case class"

  override def getApiVersion: Int = MessageFormatter.MESSAGE_FORMATTER_VERSION_1

  override def formattingNeeded(message: String): Boolean = {
    val needed: Boolean = Formatter.isFormattingNeeded(message)
    needed
  }

  override def format(message: String): String = {
    val format1: String = Formatter.format(message)
    format1
  }
}
