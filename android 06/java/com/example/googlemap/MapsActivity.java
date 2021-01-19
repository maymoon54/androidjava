package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLng mws, mwr, mwm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        //선그리기
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Polyline polyline1 = mMap.addPolyline(new PolylineOptions()
                        .clickable(true)
                        .add(mws, mwm, mwr)
                );
                stylePolyline(polyline1);

            }
        });

        //다각형만들기
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Polygon polygon1 = mMap.addPolygon(new PolygonOptions()
                        .clickable(true)
                        .add(mws, mwm, mwr)
                );
                polygon1.setFillColor(Color.BLUE);
            }
        });
    }

    public void stylePolyline(Polyline polyline1){
        polyline1.setWidth(12);
        polyline1.setColor(Color.BLUE);
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        // 망원역 37.5560985925497, 126.91005926920563
        // 망원시장 37.55673199633891, 126.90606832687618
        // 망원 한강 37.55590479301451, 126.89454874059092
        mws = new LatLng(37.5560985925497, 126.91005926920563);
        mwm = new LatLng(37.55673199633891, 126.90606832687618);
        mwr = new LatLng(37.55590479301451, 126.89454874059092);

        mMap.addMarker(new MarkerOptions().position(mws).title("망원역"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mws));

        mMap.addMarker(new MarkerOptions().position(mwm).title("망원시장"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mwm));

        mMap.addMarker(new MarkerOptions().position(mwr).title("한강망원지구"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mwr));
    }
}



