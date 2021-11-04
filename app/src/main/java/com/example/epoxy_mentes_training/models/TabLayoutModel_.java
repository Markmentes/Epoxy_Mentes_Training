package com.example.epoxy_mentes_training.models;

import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.util.BitSet;

import io.runningwild.epoxycarousel.models.TabLayout;

/**
 * Generated file. Do not modify! */
public class TabLayoutModel_ extends EpoxyModel<TabLayout> implements GeneratedModel<TabLayout>, TabLayoutModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(2);

  private OnModelBoundListener<TabLayoutModel_, TabLayout> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<TabLayoutModel_, TabLayout> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<TabLayoutModel_, TabLayout> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<TabLayoutModel_, TabLayout> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  private int count_Int = 0;

  /**
   * Bitset index: 1 */
  private int checked_Int = 0;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected TabLayout buildView(ViewGroup parent) {
    TabLayout v = new TabLayout(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final TabLayout object,
                            final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final TabLayout object) {
    super.bind(object);
    object.setChecked(checked_Int);
    object.setCount(count_Int);
  }

  @Override
  public void bind(final TabLayout object, EpoxyModel previousModel) {
    if (!(previousModel instanceof TabLayoutModel_)) {
      bind(object);
      return;
    }
    TabLayoutModel_ that = (TabLayoutModel_) previousModel;
    super.bind(object);

    if ((checked_Int != that.checked_Int)) {
      object.setChecked(checked_Int);
    }

    if ((count_Int != that.count_Int)) {
      object.setCount(count_Int);
    }
  }

  @Override
  public void handlePostBind(final TabLayout object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public TabLayoutModel_ onBind(OnModelBoundListener<TabLayoutModel_, TabLayout> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(TabLayout object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public TabLayoutModel_ onUnbind(OnModelUnboundListener<TabLayoutModel_, TabLayout> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final TabLayout object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public TabLayoutModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<TabLayoutModel_, TabLayout> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final TabLayout object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public TabLayoutModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<TabLayoutModel_, TabLayout> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Optional</i>: Default value is 0
   *
   * @see TabLayout#setCount(int)
   */
  public TabLayoutModel_ count(int count) {
    assignedAttributes_epoxyGeneratedModel.set(0);
    onMutation();
    this.count_Int = count;
    return this;
  }

  public int count() {
    return count_Int;
  }

  /**
   * <i>Optional</i>: Default value is 0
   *
   * @see TabLayout#setChecked(int)
   */
  public TabLayoutModel_ checked(int checked) {
    assignedAttributes_epoxyGeneratedModel.set(1);
    onMutation();
    this.checked_Int = checked;
    return this;
  }

  public int checked() {
    return checked_Int;
  }

  @Override
  public TabLayoutModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public TabLayoutModel_ id(@Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public TabLayoutModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public TabLayoutModel_ id(@Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public TabLayoutModel_ id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public TabLayoutModel_ id(@Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public TabLayoutModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public TabLayoutModel_ spanSizeOverride(
      @Nullable SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public TabLayoutModel_ show() {
    super.show();
    return this;
  }

  @Override
  public TabLayoutModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public TabLayoutModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public TabLayoutModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.count_Int = 0;
    this.checked_Int = 0;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof TabLayoutModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    TabLayoutModel_ that = (TabLayoutModel_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((count_Int != that.count_Int)) {
      return false;
    }
    if ((checked_Int != that.checked_Int)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + count_Int;
    result = 31 * result + checked_Int;
    return result;
  }

  @Override
  public String toString() {
    return "TabLayoutModel_{" +
        "count_Int=" + count_Int +
        ", checked_Int=" + checked_Int +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
