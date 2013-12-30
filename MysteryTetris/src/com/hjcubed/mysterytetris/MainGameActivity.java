package com.hjcubed.mysterytetris;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import android.util.DisplayMetrics;

public class MainGameActivity extends SimpleBaseGameActivity {
	Camera camera; 
	Scene scene; 
	TetrisBoard board;

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
		createBoard(scene);
		return scene;
	}
	
	public TetrisBoard createBoard(Scene scene) {
		board = new TetrisBoard(scene);
		TetrisBoard.Square sq= board.new Square();
		return board;
	}
    
}
