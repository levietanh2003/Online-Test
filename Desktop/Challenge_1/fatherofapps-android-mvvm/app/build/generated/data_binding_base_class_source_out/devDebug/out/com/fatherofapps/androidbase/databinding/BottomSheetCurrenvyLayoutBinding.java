// Generated by view binder compiler. Do not edit!
package com.fatherofapps.androidbase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fatherofapps.androidbase.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetCurrenvyLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView currencyListTitle;

  @NonNull
  public final RecyclerView currencyRecyclerView;

  private BottomSheetCurrenvyLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull TextView currencyListTitle, @NonNull RecyclerView currencyRecyclerView) {
    this.rootView = rootView;
    this.currencyListTitle = currencyListTitle;
    this.currencyRecyclerView = currencyRecyclerView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetCurrenvyLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetCurrenvyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_currenvy_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetCurrenvyLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.currency_list_title;
      TextView currencyListTitle = ViewBindings.findChildViewById(rootView, id);
      if (currencyListTitle == null) {
        break missingId;
      }

      id = R.id.currency_recycler_view;
      RecyclerView currencyRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (currencyRecyclerView == null) {
        break missingId;
      }

      return new BottomSheetCurrenvyLayoutBinding((LinearLayout) rootView, currencyListTitle,
          currencyRecyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
