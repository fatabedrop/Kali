package com.example.fatima.kali;

import android.location.Location;
import android.location.LocationListener;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;

public class MapaActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap mGoogleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(isGooglePlayServicesAvailable()){
            setContentView(R.layout.activity_mapa);
            initMap();
        }else{
            //Aqui hay que poner que jale un xml para que se muestre si no tiene los permisos para
            //google play services
                setContentView(R.layout.no_permissions);
        }

    }

    private void initMap() {
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.layout.activity_mapa);
        mapFragment.getMapAsync(this);
    }

    public boolean isGooglePlayServicesAvailable() {
        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        int disponible = api.isGooglePlayServicesAvailable(this);
        if (disponible == ConnectionResult.SUCCESS) {
            return true;
        } else {
            news("No se puede conectar con Play Services");
            return false;
        }
    }


    public void news(String texto){
        Toast.makeText(this,texto,Toast.LENGTH_LONG).show();
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
    }
}
