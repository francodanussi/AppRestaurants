package com.example.diagnostifo.integradordanussioctubre;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diagnostifo on 21/10/2016.
 */
public class AdapterDeRestaurants extends FragmentStatePagerAdapter {

    private List<FragmentRestaurant> fragmentsRestaurant;
    public AdapterDeRestaurants(FragmentManager fm) {
        super(fm);

        fragmentsRestaurant = new ArrayList<>();
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(0,R.drawable.ailpalagio,"A Il Palagio","Florencia, Italia"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(1,R.drawable.astridygaston,"Astrid y Gastón","Lima, Perú"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(2,R.drawable.borago,"Borago","Vitacura, Chile"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(3,R.drawable.central,"Central","Lima, Perú"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(4,R.drawable.dom,"D.O.M","San Pablo, Brasil"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(5,R.drawable.els4gats,"Els 4 Gats","Barcelona, España"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(6,R.drawable.maido,"Maido","MiraFlores, Perú"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(7,R.drawable.mani,"Mani","San Pablo, Brasil"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(8,R.drawable.quintonil,"Quintonil","D.F., México"));
        this.fragmentsRestaurant.add(FragmentRestaurant.dameUnFragmentDeRestaurant(9,R.drawable.tegui,"Tegui","Buenos Aires, Argentina"));
        }

    @Override
    public Fragment getItem(int position) {
        return fragmentsRestaurant.get(position);
    }

    @Override
    public int getCount() {

        return fragmentsRestaurant.size();
    }
}
