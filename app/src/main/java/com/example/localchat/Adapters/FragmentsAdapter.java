package com.example.localchat.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.localchat.Fragments.ChatsFragment;
import com.example.localchat.Fragments.SomethingSoonFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {

    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //свайпы
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new ChatsFragment();
            case 1:
                return new SomethingSoonFragment();
            default:
                return new ChatsFragment();
        }
    }

    //кол-во свайпов
    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;

        if(position == 0){
            title = "Chats";
        }
        if(position == 1){
            title = "Information";
        }
        return title;
    }
}
