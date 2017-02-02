package anjithsasindran.carouselviewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import anjithsasindran.carouselviewpager.fragments.CarFragment;

/**
 * Created by Anjith Sasindran
 * on 12-Feb-16.
 */
public class CarPagerAdapter extends FragmentStatePagerAdapter {

    public static final int PAGE_COUNT = 5;

    public CarPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new CarFragment().setFragmentPosition(position);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}