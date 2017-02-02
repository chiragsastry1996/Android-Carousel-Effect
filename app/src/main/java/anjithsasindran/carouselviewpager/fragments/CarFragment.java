package anjithsasindran.carouselviewpager.fragments;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.graphics.Palette;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import anjithsasindran.carouselviewpager.R;
import anjithsasindran.carouselviewpager.activity.Drama;
import anjithsasindran.carouselviewpager.activity.Gaming;
import anjithsasindran.carouselviewpager.activity.Music;
import anjithsasindran.carouselviewpager.activity.Dancing;
import anjithsasindran.carouselviewpager.activity.Technical;


public class CarFragment extends Fragment {

    View view;
    ImageView carImage;
    Button button1;


    int position;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.car_fragment_layout, container, false);

        carImage = (ImageView) view.findViewById(R.id.car_image);
        button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent3 = new Intent(getActivity(),Dancing.class);
                startActivity(intent3);
            }
        });
        setUpFragmentData();

        return view;
    }

    public void setUpFragmentData() {
        switch (position) {
            case 0:
                setCarImage(R.mipmap.chevrolet_corvette_stingray);
                button1 = (Button) view.findViewById(R.id.button1);
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent3 = new Intent(getActivity(),Dancing.class);
                        startActivity(intent3);
                    }
                });
                break;
            case 1:
                setCarImage(R.mipmap.pagani_zonda_cinque);
                button1 = (Button) view.findViewById(R.id.button1);
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent4 = new Intent(getActivity(),Music.class);
                        startActivity(intent4);
                    }
                });
                break;
            case 2:
                setCarImage(R.mipmap.lamborghini_aventador);
                button1 = (Button) view.findViewById(R.id.button1);
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent4 = new Intent(getActivity(),Gaming.class);
                        startActivity(intent4);
                    }
                });
                break;
            case 3:
                setCarImage(R.mipmap.bugatti);
                button1 = (Button) view.findViewById(R.id.button1);
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent5 = new Intent(getActivity(),Technical.class);
                        startActivity(intent5);
                    }
                });
                break;
            case 4:
                setCarImage(R.mipmap.mclaren_p1);
                button1 = (Button) view.findViewById(R.id.button1);
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent6 = new Intent(getActivity(),Drama.class);
                        startActivity(intent6);
                    }
                });
                break;
        }
    }

    public void setCarImage(int image) {
        carImage.setImageResource(image);
    }

    public Fragment setFragmentPosition(int position) {
        this.position = position;
        return this;
    }

}