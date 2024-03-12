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
import com.simplemobiletools.commons.views.MyRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogSelectTimeZonesBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout selectTimeZonesHolder;

  @NonNull
  public final MyRecyclerView selectTimeZonesList;

  private DialogSelectTimeZonesBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout selectTimeZonesHolder, @NonNull MyRecyclerView selectTimeZonesList) {
    this.rootView = rootView;
    this.selectTimeZonesHolder = selectTimeZonesHolder;
    this.selectTimeZonesList = selectTimeZonesList;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogSelectTimeZonesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogSelectTimeZonesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_select_time_zones, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogSelectTimeZonesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout selectTimeZonesHolder = (RelativeLayout) rootView;

      id = R.id.select_time_zones_list;
      MyRecyclerView selectTimeZonesList = ViewBindings.findChildViewById(rootView, id);
      if (selectTimeZonesList == null) {
        break missingId;
      }

      return new DialogSelectTimeZonesBinding((RelativeLayout) rootView, selectTimeZonesHolder,
          selectTimeZonesList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}