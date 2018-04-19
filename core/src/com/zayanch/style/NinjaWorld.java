package com.zayanch.style;


import com.badlogic.gdx.Game;

public class NinjaWorld extends Game {

	@Override
	public void create () {
		this.setScreen(new MainScreen(this));
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

}
