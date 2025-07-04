// Generated by view binder compiler. Do not edit!
package com.smartnutrition.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.smartnutrition.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRecentMealBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mealCaloriesText;

  @NonNull
  public final TextView mealDescriptionText;

  @NonNull
  public final TextView mealTypeText;

  private ItemRecentMealBinding(@NonNull LinearLayout rootView, @NonNull TextView mealCaloriesText,
      @NonNull TextView mealDescriptionText, @NonNull TextView mealTypeText) {
    this.rootView = rootView;
    this.mealCaloriesText = mealCaloriesText;
    this.mealDescriptionText = mealDescriptionText;
    this.mealTypeText = mealTypeText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRecentMealBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRecentMealBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_recent_meal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRecentMealBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mealCaloriesText;
      TextView mealCaloriesText = ViewBindings.findChildViewById(rootView, id);
      if (mealCaloriesText == null) {
        break missingId;
      }

      id = R.id.mealDescriptionText;
      TextView mealDescriptionText = ViewBindings.findChildViewById(rootView, id);
      if (mealDescriptionText == null) {
        break missingId;
      }

      id = R.id.mealTypeText;
      TextView mealTypeText = ViewBindings.findChildViewById(rootView, id);
      if (mealTypeText == null) {
        break missingId;
      }

      return new ItemRecentMealBinding((LinearLayout) rootView, mealCaloriesText,
          mealDescriptionText, mealTypeText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
