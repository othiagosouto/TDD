package refactor.ui


class FeatureC(private val mapper: LabelMapper) {

    fun getUiLabel(isSoldOut: Boolean): UiLabel? {
        return mapper.soldOutLabel(isSoldOut)
    }
}
