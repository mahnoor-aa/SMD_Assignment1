package com.example.smd_a1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdap extends FragmentStateAdapter {
    public ViewPagerAdap(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new one();
            case 1:
                return new two();
            default:return new one();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
