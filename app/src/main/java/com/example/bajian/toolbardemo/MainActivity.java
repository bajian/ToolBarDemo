package com.example.bajian.toolbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * this demo is based on http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2014/1118/2006.html
 *  http://www.jcodecraeer.com/uploads/20141118/1416285884351.png
 *  http://www.jcodecraeer.com/uploads/20141118/14162849281137.png
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniViews();
    }

    private void iniViews() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
/*        // App Logo
        toolbar.setLogo(R.mipmap.ic_launcher);
        // Title
        toolbar.setTitle("My Title");
        toolbar.setTitleTextAppearance(this, R.style.BlueText);
        // Sub Title
        toolbar.setSubtitle("Sub title");
        setSupportActionBar(toolbar);
        // Navigation Icon 要設定在 setSupoortActionBar 才有作用 否則會出現 back button

        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);*/
        //其实可以完全自己布局的，Toolbar 相对于 ActionBar的强大之处在于，ToolBar有更强大的自定义效果。因为ToolBar本身就是一个ViewGroup，可以往Toolbar中放入各种组件。
        //根据这篇http://www.cnblogs.com/bvin/p/4311240.html
//        toolbar.setNavigationIcon();
    }


}
