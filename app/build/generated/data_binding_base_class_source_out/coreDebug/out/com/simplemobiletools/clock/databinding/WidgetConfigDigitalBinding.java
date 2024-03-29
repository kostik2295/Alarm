// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.clock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.clock.R;
import com.simplemobiletools.commons.views.MySeekBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WidgetConfigDigitalBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout configCoordinator;

  @NonNull
  public final ImageView configDigitalBackground;

  @NonNull
  public final ImageView configDigitalBgColor;

  @NonNull
  public final MySeekBar configDigitalBgSeekbar;

  @NonNull
  public final TextClock configDigitalDate;

  @NonNull
  public final RelativeLayout configDigitalHolder;

  @NonNull
  public final Button configDigitalSave;

  @NonNull
  public final RelativeLayout configDigitalSeekbarHolder;

  @NonNull
  public final ImageView configDigitalTextColor;

  @NonNull
  public final TextClock configDigitalTime;

  @NonNull
  public final RelativeLayout configDigitalWrapper;

  private WidgetConfigDigitalBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout configCoordinator, @NonNull ImageView configDigitalBackground,
      @NonNull ImageView configDigitalBgColor, @NonNull MySeekBar configDigitalBgSeekbar,
      @NonNull TextClock configDigitalDate, @NonNull RelativeLayout configDigitalHolder,
      @NonNull Button configDigitalSave, @NonNull RelativeLayout configDigitalSeekbarHolder,
      @NonNull ImageView configDigitalTextColor, @NonNull TextClock configDigitalTime,
      @NonNull RelativeLayout configDigitalWrapper) {
    this.rootView = rootView;
    this.configCoordinator = configCoordinator;
    this.configDigitalBackground = configDigitalBackground;
    this.configDigitalBgColor = configDigitalBgColor;
    this.configDigitalBgSeekbar = configDigitalBgSeekbar;
    this.configDigitalDate = configDigitalDate;
    this.configDigitalHolder = configDigitalHolder;
    this.configDigitalSave = configDigitalSave;
    this.configDigitalSeekbarHolder = configDigitalSeekbarHolder;
    this.configDigitalTextColor = configDigitalTextColor;
    this.configDigitalTime = configDigitalTime;
    this.configDigitalWrapper = configDigitalWrapper;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WidgetConfigDigitalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WidgetConfigDigitalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.widget_config_digital, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WidgetConfigDigitalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout configCoordinator = (CoordinatorLayout) rootView;

      id = R.id.config_digital_background;
      ImageView configDigitalBackground = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalBackground == null) {
        break missingId;
      }

      id = R.id.config_digital_bg_color;
      ImageView configDigitalBgColor = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalBgColor == null) {
        break missingId;
      }

      id = R.id.config_digital_bg_seekbar;
      MySeekBar configDigitalBgSeekbar = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalBgSeekbar == null) {
        break missingId;
      }

      id = R.id.config_digital_date;
      TextClock configDigitalDate = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalDate == null) {
        break missingId;
      }

      id = R.id.config_digital_holder;
      RelativeLayout configDigitalHolder = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalHolder == null) {
        break missingId;
      }

      id = R.id.config_digital_save;
      Button configDigitalSave = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalSave == null) {
        break missingId;
      }

      id = R.id.config_digital_seekbar_holder;
      RelativeLayout configDigitalSeekbarHolder = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalSeekbarHolder == null) {
        break missingId;
      }

      id = R.id.config_digital_text_color;
      ImageView configDigitalTextColor = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalTextColor == null) {
        break missingId;
      }

      id = R.id.config_digital_time;
      TextClock configDigitalTime = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalTime == null) {
        break missingId;
      }

      id = R.id.config_digital_wrapper;
      RelativeLayout configDigitalWrapper = ViewBindings.findChildViewById(rootView, id);
      if (configDigitalWrapper == null) {
        break missingId;
      }

      return new WidgetConfigDigitalBinding((CoordinatorLayout) rootView, configCoordinator,
          configDigitalBackground, configDigitalBgColor, configDigitalBgSeekbar, configDigitalDate,
          configDigitalHolder, configDigitalSave, configDigitalSeekbarHolder,
          configDigitalTextColor, configDigitalTime, configDigitalWrapper);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
