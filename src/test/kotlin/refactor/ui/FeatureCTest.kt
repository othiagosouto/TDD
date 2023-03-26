package refactor.ui

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FeatureCTest {
    private val mapper = LabelMapper()
    private val featureC = FeatureC(mapper)


    @Test
    fun `Given isSoldOut true Then returns soldOut label`() {

        val result = featureC.getUiLabel(isSoldOut = true)

        assertEquals(
            expected = UiLabel(
                text = "sold-out",
                backgroundColor = "white",
                textColor = "red"
            ), actual = result
        )
    }

    @Test
    fun `Given isSoldOut false Then returns null`() {

        val result = featureC.getUiLabel(isSoldOut = false)

        assertNull(result)
    }

}