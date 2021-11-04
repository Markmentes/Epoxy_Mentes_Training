package com.example.epoxy_mentes_training.models;

import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;

import io.runningwild.epoxycarousel.models.TabLayout;

public interface TabLayoutModelBuilder {
  TabLayoutModelBuilder onBind(OnModelBoundListener<TabLayoutModel_, TabLayout> listener);

  TabLayoutModelBuilder onUnbind(OnModelUnboundListener<TabLayoutModel_, TabLayout> listener);

  TabLayoutModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<TabLayoutModel_, TabLayout> listener);

  TabLayoutModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<TabLayoutModel_, TabLayout> listener);

  TabLayoutModelBuilder count(int count);

  TabLayoutModelBuilder checked(int checked);

  TabLayoutModelBuilder id(long id);

  TabLayoutModelBuilder id(@Nullable Number... ids);

  TabLayoutModelBuilder id(long id1, long id2);

  TabLayoutModelBuilder id(@Nullable CharSequence key);

  TabLayoutModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  TabLayoutModelBuilder id(@Nullable CharSequence key, long id);

  TabLayoutModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
