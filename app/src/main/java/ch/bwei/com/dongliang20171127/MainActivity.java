package ch.bwei.com.dongliang20171127;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDraweeView simpleDraweeView=findViewById(R.id.simplerdraweeview);
        simpleDraweeView.setImageURI("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1503854327078&di=08bdf32f7a117deafd580ca006b80a67&imgtype=0&src=http%3A%2F%2Fnews.k618.cn%2Fpic%2Fdmyx%2F201505%2FW020150501335817970176.jpg");

    }
}
