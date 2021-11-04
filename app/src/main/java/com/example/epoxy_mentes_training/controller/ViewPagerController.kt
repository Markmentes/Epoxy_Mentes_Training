package com.example.epoxy_mentes_training.controller

import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.VisibilityState.FOCUSED_VISIBLE
import com.airbnb.epoxy.carousel
import com.example.epoxy_mentes_training.R
import com.example.epoxy_mentes_training.controller.data.ViewPagerData
import com.example.epoxy_mentes_training.models.ViewPagerItem_
import com.example.epoxy_mentes_training.models.TabLayoutModel_


class ViewPagerController : TypedEpoxyController<ViewPagerData>() {

    override fun buildModels(data: ViewPagerData) {
        carousel {
            id("This is a ViewPager.")
            hasFixedSize(true)
            paddingRes(R.dimen.view_pager_item_padding)
            models(data.items.mapIndexed { index, item ->
                ViewPagerItem_()
                        .id(item)
                        .title(item)
                        .onVisibilityStateChanged { _, _, visibilityState ->
                            if (visibilityState == FOCUSED_VISIBLE) {
                                data.visibleItemIndex = index
                                setData(data)
                            }
                        }
            })
        }
        TabLayoutModel_()
                .id("This is the ViewPager's TabLayout.")
                .count(data.items.size)
                .checked(data.visibleItemIndex)
                .addTo(this)
    }
}
