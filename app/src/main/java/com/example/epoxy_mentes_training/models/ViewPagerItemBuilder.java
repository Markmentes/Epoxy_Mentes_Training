package com.example.epoxy_mentes_training.models;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.String;
import org.jetbrains.annotations.NotNull;

import io.runningwild.epoxycarousel.models.ViewPagerItem;

public interface ViewPagerItemBuilder {
  ViewPagerItemBuilder onBind(OnModelBoundListener<ViewPagerItem_, ViewPagerItem.Holder> listener);

  ViewPagerItemBuilder onUnbind(
      OnModelUnboundListener<ViewPagerItem_, ViewPagerItem.Holder> listener);

  ViewPagerItemBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ViewPagerItem_, ViewPagerItem.Holder> listener);

  ViewPagerItemBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<ViewPagerItem_, ViewPagerItem.Holder> listener);

  ViewPagerItemBuilder title(@NotNull String title);

  ViewPagerItemBuilder id(long id);

  ViewPagerItemBuilder id(@Nullable Number... ids);

  ViewPagerItemBuilder id(long id1, long id2);

  ViewPagerItemBuilder id(@Nullable CharSequence key);

  ViewPagerItemBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  ViewPagerItemBuilder id(@Nullable CharSequence key, long id);

  ViewPagerItemBuilder layout(@LayoutRes int layoutRes);

  ViewPagerItemBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
