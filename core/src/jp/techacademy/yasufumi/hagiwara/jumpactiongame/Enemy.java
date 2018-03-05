package jp.techacademy.yasufumi.hagiwara.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by hagiwara on 2018/03/03.
 */

public class Enemy extends GameObject {
    public static final float ENEMY_WIDTH = 1.0f;
    public static final float ENEMY_HEIGHT = 1.0f;

    public static final float ENEMY_VELOCITY = 5.0f;

    int mState;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        velocity.x = ENEMY_VELOCITY;
    }

    public void update(float deltaTime){
        setX(getX() + velocity.x * deltaTime);

        if (getX() < ENEMY_WIDTH /2 ){
            velocity.x = -velocity.x;
            setX(ENEMY_WIDTH / 2);
        }
        if (getX() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2){
            velocity.x = - velocity.x;
            setX(GameScreen.WORLD_WIDTH - ENEMY_WIDTH /2);
        }
    }


}
