package industrialserver;

import com.badlogic.gdx.ApplicationAdapter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class IndustrialServer extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Server server;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		server = new Server();
		server.create(27015, 10);
	}

	@Override
	public void render () {
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		
		batch.begin();
		server.render();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
