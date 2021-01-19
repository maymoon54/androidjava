package com.example.app05;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MyTab extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_tab);

        TabHost tabHost = getTabHost();

        /*탭 하나씩 정의*/
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpec1.setContent(R.id.tabSong);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpec2.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpec3.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(0);
        //시작될때 출력하는 탭

    }
}
