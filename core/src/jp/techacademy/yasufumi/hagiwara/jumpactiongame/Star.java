package jp.techacademy.yasufumi.hagiwara.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by hagiwara on 2018/02/25.
 */

public class Star extends Sprite {

    public static final float START_WIDTH = 0.8f;
    public static final float START_HEIGHT = 0.8f;

    public static final int STAR_EXIST = 0;
    public static final int STAR_NONE = 1;

    int mState;

    public Star(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(START_WIDTH, START_HEIGHT);
        mState = STAR_EXIST;
    }

    public void get(){
        mState = STAR_NONE;
        setAlpha(0);
    }

}
