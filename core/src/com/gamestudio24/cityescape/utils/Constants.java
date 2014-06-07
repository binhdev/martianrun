package com.gamestudio24.cityescape.utils;

import com.badlogic.gdx.math.Vector2;

public class Constants {

    public static final String GAME_NAME = "City Escape!";

    public static final int APP_WIDTH = 800;
    public static final int APP_HEIGHT = 480;
    public static final float WORLD_TO_SCREEN = 32;

    public static final Vector2 WORLD_GRAVITY = new Vector2(0, -10);

    public static final float GROUND_X = 0;
    public static final float GROUND_Y = 0;
    public static final float GROUND_WIDTH = 25f;
    public static final float GROUND_HEIGHT = 2f;
    public static final float GROUND_DENSITY = 0f;

    public static final float RUNNER_X = 2;
    public static final float RUNNER_Y = GROUND_Y + GROUND_HEIGHT;
    public static final float RUNNER_WIDTH = 1f;
    public static final float RUNNER_HEIGHT = 2f;
    public static final float RUNNER_GRAVITY_SCALE = 3f;
    public static final float RUNNER_DENSITY = 0.5f;
    public static final float RUNNER_DODGE_X = 2f;
    public static final float RUNNER_DODGE_Y = 1.5f;
    public static final Vector2 RUNNER_JUMPING_LINEAR_IMPULSE = new Vector2(0, 13f);
    public static final float RUNNER_HIT_ANGULAR_IMPULSE = 10f;

    public static final float ENEMY_X = 25f;
    public static final float ENEMY_DENSITY = RUNNER_DENSITY;
    public static final float RUNNING_SHORT_ENEMY_Y = 1.5f;
    public static final float RUNNING_LONG_ENEMY_Y = 2f;
    public static final float FLYING_ENEMY_Y = 3f;
    public static final Vector2 ENEMY_LINEAR_VELOCITY = new Vector2(-10f, 0);

    public static final String BACKGROUND_IMAGE_PATH = "background.png";
    public static final String GROUND_IMAGE_PATH = "ground.png";
    public static final String SPRITES_ATLAS_PATH = "sprites.txt";
    public static final String[] RUNNER_RUNNING_REGION_NAMES = new String[] {"alienGreen_run1", "alienGreen_run2"};
    public static final String RUNNER_DODGING_REGION_NAME = "alienGreen_dodge";
    public static final String RUNNER_HIT_REGION_NAME = "alienGreen_hit";
    public static final String RUNNER_JUMPING_REGION_NAME = "alienGreen_jump";

    public static final String[] RUNNING_SMALL_ENEMY_REGION_NAMES = new String[] {"ladyBug_walk1", "ladyBug_walk2"};
    public static final String[] RUNNING_LONG_ENEMY_REGION_NAMES = new String[] {"barnacle_bite1", "barnacle_bite2"};
    public static final String[] RUNNING_BIG_ENEMY_REGION_NAMES = new String[] {"spider_walk1", "spider_walk2"};
    public static final String[] RUNNING_WIDE_ENEMY_REGION_NAMES = new String[] {"worm_walk1", "worm_walk2"};
    public static final String[] FLYING_SMALL_ENEMY_REGION_NAMES = new String[] {"bee_fly1", "bee_fly2"};
    public static final String[] FLYING_WIDE_ENEMY_REGION_NAMES = new String[] {"fly_fly1", "fly_fly2"};

    public static final String SOUND_ON_REGION_NAME = "sound_on";
    public static final String SOUND_OFF_REGION_NAME = "sound_off";
    public static final String MUSIC_ON_REGION_NAME = "music_on";
    public static final String MUSIC_OFF_REGION_NAME = "music_off";
    public static final String PAUSE_REGION_NAME = "pause";
    public static final String PLAY_REGION_NAME = "play";
    public static final String BIG_PLAY_REGION_NAME = "play_big";
    public static final String LEADERBOARD_REGION_NAME = "leaderboard";
    public static final String ABOUT_REGION_NAME = "about";
    public static final String CLOSE_REGION_NAME = "close";

    public static final String RUNNER_JUMPING_SOUND = "jump.wav";
    public static final String RUNNER_HIT_SOUND = "hit.wav";
    public static final String GAME_MUSIC = "fun_in_a_bottle.mp3";

    public static final String FONT_NAME = "roboto_bold.ttf";

    public static final String ABOUT_TEXT = "Developed by: @gamestudio24\nPowered by: @libgdx\nGraphics: @kenneywings"
            + "\nMusic: @incompetech";

}
