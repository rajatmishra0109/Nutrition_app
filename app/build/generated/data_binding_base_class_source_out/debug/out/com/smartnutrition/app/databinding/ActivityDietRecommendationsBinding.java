// Generated by view binder compiler. Do not edit!
package com.smartnutrition.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.smartnutrition.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDietRecommendationsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Chip allChip;

  @NonNull
  public final Chip breakfastChip;

  @NonNull
  public final Chip dinnerChip;

  @NonNull
  public final ChipGroup filterChipGroup;

  @NonNull
  public final Chip lunchChip;

  @NonNull
  public final CircularProgressIndicator progressIndicator;

  @NonNull
  public final RecyclerView recipesRecyclerView;

  @NonNull
  public final Chip snacksChip;

  @NonNull
  public final Chip soupChip;

  @NonNull
  public final Toolbar toolbar;

  private ActivityDietRecommendationsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull Chip allChip, @NonNull Chip breakfastChip, @NonNull Chip dinnerChip,
      @NonNull ChipGroup filterChipGroup, @NonNull Chip lunchChip,
      @NonNull CircularProgressIndicator progressIndicator,
      @NonNull RecyclerView recipesRecyclerView, @NonNull Chip snacksChip, @NonNull Chip soupChip,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.allChip = allChip;
    this.breakfastChip = breakfastChip;
    this.dinnerChip = dinnerChip;
    this.filterChipGroup = filterChipGroup;
    this.lunchChip = lunchChip;
    this.progressIndicator = progressIndicator;
    this.recipesRecyclerView = recipesRecyclerView;
    this.snacksChip = snacksChip;
    this.soupChip = soupChip;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDietRecommendationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDietRecommendationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_diet_recommendations, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDietRecommendationsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.allChip;
      Chip allChip = ViewBindings.findChildViewById(rootView, id);
      if (allChip == null) {
        break missingId;
      }

      id = R.id.breakfastChip;
      Chip breakfastChip = ViewBindings.findChildViewById(rootView, id);
      if (breakfastChip == null) {
        break missingId;
      }

      id = R.id.dinnerChip;
      Chip dinnerChip = ViewBindings.findChildViewById(rootView, id);
      if (dinnerChip == null) {
        break missingId;
      }

      id = R.id.filterChipGroup;
      ChipGroup filterChipGroup = ViewBindings.findChildViewById(rootView, id);
      if (filterChipGroup == null) {
        break missingId;
      }

      id = R.id.lunchChip;
      Chip lunchChip = ViewBindings.findChildViewById(rootView, id);
      if (lunchChip == null) {
        break missingId;
      }

      id = R.id.progressIndicator;
      CircularProgressIndicator progressIndicator = ViewBindings.findChildViewById(rootView, id);
      if (progressIndicator == null) {
        break missingId;
      }

      id = R.id.recipesRecyclerView;
      RecyclerView recipesRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recipesRecyclerView == null) {
        break missingId;
      }

      id = R.id.snacksChip;
      Chip snacksChip = ViewBindings.findChildViewById(rootView, id);
      if (snacksChip == null) {
        break missingId;
      }

      id = R.id.soupChip;
      Chip soupChip = ViewBindings.findChildViewById(rootView, id);
      if (soupChip == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityDietRecommendationsBinding((CoordinatorLayout) rootView, allChip,
          breakfastChip, dinnerChip, filterChipGroup, lunchChip, progressIndicator,
          recipesRecyclerView, snacksChip, soupChip, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
