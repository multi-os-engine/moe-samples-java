// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package org.moe.libgdxmissilecommand.common.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import org.moe.libgdxmissilecommand.common.MissileCommand;

public class StartGameScreen extends ScreenAdapter {

    MissileCommand game;
    OrthographicCamera guiCam;
    BitmapFont font;

    long startTimeSec;

    public StartGameScreen(MissileCommand game) {
        this.game = game;

        font = new BitmapFont(org.moe.libgdxmissilecommand.common.Assets.fontFile);
        font.getData().setScale(0.6f);

        guiCam = new OrthographicCamera(org.moe.libgdxmissilecommand.common.Assets.screenWidth, org.moe.libgdxmissilecommand.common.Assets.screenHeight);
        guiCam.position.set(org.moe.libgdxmissilecommand.common.Assets.screenWidth / 2, org.moe.libgdxmissilecommand.common.Assets.screenHeight / 2, 0);

        org.moe.libgdxmissilecommand.common.Assets.playSound(org.moe.libgdxmissilecommand.common.Assets.alarmSound);
        startTimeSec = System.currentTimeMillis() / 1000;
    }

    @Override
    public void render (float delta) {
        GL20 gl = Gdx.gl;
        gl.glClearColor(1, 0, 0, 1);
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        guiCam.update();

        game.batcher.setProjectionMatrix(guiCam.combined);

        long currentTimeSec = System.currentTimeMillis() / 1000;

        game.batcher.begin();
        if((currentTimeSec - startTimeSec) % 2 == 0) {
            game.batcher.draw(org.moe.libgdxmissilecommand.common.Assets.backgroundLoadGame1TextureRegion, 0, 0, org.moe.libgdxmissilecommand.common.Assets.screenWidth, org.moe.libgdxmissilecommand.common.Assets.screenHeight);
        } else {
            game.batcher.draw(org.moe.libgdxmissilecommand.common.Assets.backgroundLoadGame2TextureRegion, 0, 0, org.moe.libgdxmissilecommand.common.Assets.screenWidth, org.moe.libgdxmissilecommand.common.Assets.screenHeight);
        }
        game.batcher.end();

        game.batcher.enableBlending();
        game.batcher.begin();

        if((currentTimeSec - startTimeSec) < 3) {
            //font.draw(game.batcher, "WARNING", 330, org.moe.libgdxmissilecommand.common.Assets.screenHeight / 2);
        } else if((currentTimeSec - startTimeSec) < 6) {
            //font.draw(game.batcher, "ALIENS SHIPS COMING", 230, org.moe.libgdxmissilecommand.common.Assets.screenHeight / 2);
        } else if((currentTimeSec - startTimeSec) < 9) {
            //font.draw(game.batcher, "PROTECT THE CITYS", 250, org.moe.libgdxmissilecommand.common.Assets.screenHeight / 2);
        } else if((currentTimeSec - startTimeSec) < 12) {
            //font.draw(game.batcher, "PREPARE THE MISSILES", 230, org.moe.libgdxmissilecommand.common.Assets.screenHeight / 2);
        } else {
            game.setScreen(new MissileCommandGameScreen(game));
        }
        game.batcher.end();
    }

    @Override
    public void pause () {
        //Settings.save();
    }
}