package de.hs_kl.imst.gatav.tilerenderer.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.io.InputStream;

public class  Chest extends TileGraphics {
    private Paint floorPaint = new Paint();

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
