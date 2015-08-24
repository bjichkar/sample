package brj.autosmsdemo;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.thrivecom.ringcaptcha.RingcaptchaApplication;
import com.thrivecom.ringcaptcha.RingcaptchaApplicationHandler;
import com.thrivecom.ringcaptcha.RingcaptchaVerification;

public class MainActivity extends Activity {
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginBtn= (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RingcaptchaApplication.verifyPhoneNumber(getApplicationContext(),"9elogomake8ori3ucono","go5o5o5ibu6emi9u2aqe",
                        new RingcaptchaApplicationHandler()
                {

                            @Override
                            public void onSuccess(RingcaptchaVerification ringcaptchaVerification) {
                                Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCancel() {
                                Toast.makeText(getApplicationContext(),"Cancel",Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });
    }


}
