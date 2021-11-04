@file:Suppress("DEPRECATION")

package io.runningwild.epoxycarousel.models

import com.airbnb.epoxy.EpoxyController
import com.example.epoxy_mentes_training.models.TabLayoutModelBuilder
import com.example.epoxy_mentes_training.models.TabLayoutModel_
import com.example.epoxy_mentes_training.models.ViewPagerItemBuilder
import com.example.epoxy_mentes_training.models.ViewPagerItem_
import kotlin.Suppress
import kotlin.Unit

inline fun EpoxyController.viewPagerItem(modelInitializer: ViewPagerItemBuilder.() -> Unit) {
    ViewPagerItem_().apply  {
        modelInitializer()
    }
    .addTo(this)
}

inline fun EpoxyController.tabLayout(modelInitializer: TabLayoutModelBuilder.() -> Unit) {
    TabLayoutModel_().apply  {
        modelInitializer()
    }
    .addTo(this)
}
