package popfisher.androiddrawclassic.canvasdraw.line;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import popfisher.androiddrawclassic.R;

public class DrawLineActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_line);
        initView();
    }

    private void initView() {
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {
        }
    }
}
