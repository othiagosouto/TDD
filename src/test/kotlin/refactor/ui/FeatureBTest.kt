package refactor.ui

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import refactor.domain.Label

class FeatureBTest {
    private val mapper = LabelMapper()
    private val featureB = FeatureB(mapper)


    @Test
    fun `Given null label Then returns null`() {

        val result = featureB.getUiLabel(label = null)

        assertNull(result)
    }

    @Test
    fun `Given label with null text-color Then returns label with default colors`() {
        val label: Label? = Label(text = "text", backgroundColor = "red", textColor = null)

        val result = mapper.toModel(label, false)

        kotlin.test.assertEquals(
            expected = UiLabel(
                text = "text",
                backgroundColor = "white",
                textColor = "black"
            ), actual = result
        )
    }

}