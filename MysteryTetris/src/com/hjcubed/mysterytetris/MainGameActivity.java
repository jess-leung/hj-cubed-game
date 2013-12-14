package com.hjcubed.mysterytetris;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;

public class MainGameActivity extends SimpleBaseGameActivity {
	Camera camera; 
	Scene scene; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_game, menu);
        return true;
    }


	@Override
	public EngineOptions onCreateEngineOptions() {
		DisplayMetrics metrics = getResources().getDisplayMetrics();
		int width  = metrics.widthPixels;
		int height = metrics.heightPixels;
		camera = new Camera(0, 0, width, height);
		 
		return new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED,
		new RatioResolutionPolicy(width, height), camera);
	}


	@Override
	protected void onCreateResources() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected Scene onCreateScene() {
		scene = new Scene(); 
		scene.setBackground(new Background(0,0,0));
		return scene;
	}
    
}
