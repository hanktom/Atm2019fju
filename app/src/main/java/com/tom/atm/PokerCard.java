package com.tom.atm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PokerCard extends ConstraintLayout {
    int value;
    private ImageView typeImage;
    private TextView leftPoint;
    private TextView rightPoint;

    public PokerCard(Context context) {
        super(context);
    }

    public PokerCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.card, this);
        typeImage = findViewById(R.id.type);
        leftPoint = findViewById(R.id.point_left_top);
        rightPoint = findViewById(R.id.point_right_bottom);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        int type = value/13;
        int point = (value%13) + 1;
        switch(type) {
            case 0:
                typeImage.setImageResource(R.drawable.clover);
                break;
            case 1:
                typeImage.setImageResource(R.drawable.diamond);
                break;
            case 2:
                typeImage.setImageResource(R.drawable.hearts);
                break;
            case 3:
                typeImage.setImageResource(R.drawable.spare);
                break;
        }
        leftPoint.setText(point+"");
        rightPoint.setText(point+"");
    }


}
