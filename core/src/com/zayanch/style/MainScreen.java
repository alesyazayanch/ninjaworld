package com.zayanch.style;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by Администратор on 19.04.2018.
 */

public class MainScreen implements Screen {

    final NinjaWorld game;

    public MainScreen(final NinjaWorld ninjaWorld){
        game=ninjaWorld;

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        //очищаем экран и устанавлеваем цвет фона белым
        Gdx.gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // если на телефоне нажата кнопка Back, то мы выходим из приложения
        if(Gdx.input.isKeyPressed(Input.Keys.BACK)){
            Gdx.app.exit();
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
