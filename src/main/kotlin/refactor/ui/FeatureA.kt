package refactor.ui

import refactor.domain.Label

class FeatureA(private val mapper: LabelMapper) {

    fun getUiLabel(label: Label?, isSoldOut: Boolean): UiLabel? {
        return mapper.toModel(label, isSoldOut)
    }
}
