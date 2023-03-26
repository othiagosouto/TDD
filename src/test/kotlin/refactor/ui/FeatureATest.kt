package refactor.ui

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import refactor.domain.Label
import kotlin.test.assertEquals

class FeatureATest {
    private val mapper = LabelMapper()
    private val featureA = FeatureA(mapper)


    @Test
    fun `Given sold-out Then returns sold-out label`() {
        val label: Label? = Label(text = "text", backgroundColor = "red", textColor = "text-color")

        val result = featureA.getUiLabel(label, true)

        assertEquals(expected = UiLabel(
            text = "sold-out",
            backgroundColor = "white",
            textColor = "red"
        ), actual = result)
    }

    @Test
    fun `Given label with null-background Then returns label with default colors`() {
        val label: Label? = Label(text = "text", backgroundColor = null, textColor = "text-color")

        val result = mapper.toModel(label, false)

        assertEquals(expected = UiLabel(
            text = "text",
            backgroundColor = "white",
            textColor = "black"
        ), actual = result)
    }

}