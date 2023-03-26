package refactor.ui

import refactor.domain.Label

class FeatureB(private val mapper: LabelMapper) {

    fun getUiLabel(label: Label?): UiLabel? {
        return mapper.toModel(label, false)
    }
}
