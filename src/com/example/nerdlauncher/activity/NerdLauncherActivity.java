
package com.example.nerdlauncher.activity;

import android.support.v4.app.Fragment;

import com.example.nerdlauncher.fragment.NerdLauncherFragment;



public class NerdLauncherActivity extends SingleFragmentActivity {

   
    @Override
    protected Fragment createFragment() {
        // TODO Auto-generated method stub
        return  new NerdLauncherFragment();
    }
}
