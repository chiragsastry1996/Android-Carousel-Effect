package anjithsasindran.carouselviewpager.activity;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import anjithsasindran.carouselviewpager.R;
import anjithsasindran.carouselviewpager.adapter.CarPagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPager;
    CarPagerAdapter carPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carPagerAdapter = new CarPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.view_pager);         //sets the background color in the carousal menu
        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setAdapter(carPagerAdapter);
        
        mViewPager.setPageMargin((int) (getResources().getDisplayMetrics().widthPixels * -0.33));
        mViewPager.setOffscreenPageLimit(5);
        mViewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override public void transformPage(View page, float position) {
                page.setScaleX(0.8f - Math.abs(position * 0.4f));
                page.setScaleY(0.8f - Math.abs(position * 0.1f));
                page.setAlpha(1.0f - Math.abs(position * 0.5f));
            }
        });

    }
}