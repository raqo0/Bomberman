package de.hs_kl.imst.gatav.tilerenderer.drawable;

import android.graphics.Color;

import java.io.InputStream;

public class  Chest extends TileGraphics {

    public Chest(int x, int y, InputStream is) {
        super(x, y, is);
        tilePaint.setColor(Color.parseColor("#149942"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isPassable() {
        return false;
    }
}
