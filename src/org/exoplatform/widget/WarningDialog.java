package org.exoplatform.widget;

import org.exoplatform.R;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class WarningDialog extends Dialog implements android.view.View.OnClickListener {
  private TextView titleView;

  private TextView contentView;

  private Button   okButton;

  public WarningDialog(Context context, String titleString, String contentString, String okString) {
    super(context);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.warning_dialog_layout);
    titleView = (TextView) findViewById(R.id.warning_title);
    titleView.setText(titleString);
    contentView = (TextView) findViewById(R.id.warning_content);
    contentView.setText(contentString);
    okButton = (Button) findViewById(R.id.warning_ok_button);
    okButton.setText(okString);
    okButton.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (view == okButton) {
      dismiss();
    }
  }

}
