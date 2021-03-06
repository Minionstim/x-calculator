package com.driver.shinekaye.olddriver;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Shine Kaye on 2016/3/28.
 */

/**
 * Fake Password change 更改伪密码
 */
public class FakePasswordActivity extends Activity {
    Button btnyes, btnno;
    EditText editText;
    SharedPreUtil sharedPreUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_password);
        btnyes = (Button) findViewById(R.id.yes);
        btnno = (Button) findViewById(R.id.no);
        editText = (EditText) findViewById(R.id.getchanged);
        sharedPreUtil = new SharedPreUtil(this);
        //确认键监听器
        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreUtil.putPassword("FAKE_PASSWORD", editText.getText().toString());
                Toast.makeText(FakePasswordActivity.this, "新的伪密码已保存", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        //取消键监听器
        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
