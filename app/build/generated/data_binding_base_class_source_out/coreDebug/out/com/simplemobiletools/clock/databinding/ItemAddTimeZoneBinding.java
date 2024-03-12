// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.clock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.clock.R;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import com.simplemobiletools.commons.views.MyTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemAddTimeZoneBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MyAppCompatCheckbox addTimeZoneCheckbox;

  @NonNull
  public final RelativeLayout addTimeZoneHolder;

  @NonNull
  public final MyTextView addTimeZoneTitle;

  private ItemAddTimeZoneBinding(@NonNull RelativeLayout rootView,
      @NonNull MyAppCompatCheckbox addTimeZoneCheckbox, @NonNull RelativeLayout addTimeZoneHolder,
      @NonNull MyTextView addTimeZoneTitle) {
    this.rootView = rootView;
    this.addTimeZoneCheckbox = addTimeZoneCheckbox;
    this.addTimeZoneHolder = addTimeZoneHolder;
    this.addTimeZoneTitle = addTimeZoneTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAddTimeZoneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAddTimeZoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_add_time_zone, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAddTimeZoneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_time_zone_checkbox;
      MyAppCompatCheckbox addTimeZoneCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (addTimeZoneCheckbox == null) {
        break missingId;
      }

      RelativeLayout addTimeZoneHolder = (RelativeLayout) rootView;

      id = R.id.add_time_zone_title;
      MyTextView addTimeZoneTitle = ViewBindings.findChildViewById(rootView, id);
      if (addTimeZoneTitle == null) {
        break missingId;
      }

      return new ItemAddTimeZoneBinding((RelativeLayout) rootView, addTimeZoneCheckbox,
          addTimeZoneHolder, addTimeZoneTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
