package refactor.ui

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FeatureBTest {
    private val mapper = LabelMapper()
    private val featureB = FeatureB(mapper)


    @Test
    fun `Given null label Then returns null`() {

        val result = featureB.getUiLabel(label = null)

        assertNull(result)
    }

}