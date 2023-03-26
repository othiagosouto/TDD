package refactor.ui

import refactor.domain.Label

class LabelMapper {

    fun toModel(label: Label?, isSoldOut: Boolean): UiLabel? {
        return label?.let {
            return soldOutLabel(isSoldOut) ?: if (label.backgroundColor != null && label.textColor != null) {
                UiLabel(
                    text = label.text,
                    backgroundColor = label.backgroundColor,
                    textColor = label.textColor
                )
            } else {
                UiLabel(
                    text = label.text,
                    backgroundColor = "white",
                    textColor = "black"
                )
            }
        }
    }

    fun soldOutLabel(isSoldOut: Boolean): UiLabel? = if (isSoldOut) UiLabel(
        text = "sold-out",
        backgroundColor = "white",
        textColor = "red"
    ) else null
}
