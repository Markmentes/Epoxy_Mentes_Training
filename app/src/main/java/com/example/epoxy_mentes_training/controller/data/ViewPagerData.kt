package com.example.epoxy_mentes_training.controller.data


import android.os.Parcel
import android.os.Parcelable


@Parcelize
open class ViewPagerData(var items: Array<String> = emptyArray(),
                         var visibleItemIndex: Int = -1
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.createStringArray() as Array<String>,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeStringArray(items)
        parcel.writeInt(visibleItemIndex)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ViewPagerData> {
        override fun createFromParcel(parcel: Parcel): ViewPagerData {
            return ViewPagerData(parcel)
        }

        override fun newArray(size: Int): Array<ViewPagerData?> {
            return arrayOfNulls(size)
        }
    }
}


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class Parcelize