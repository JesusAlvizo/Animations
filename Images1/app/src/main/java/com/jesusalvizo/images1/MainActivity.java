package com.jesusalvizo.images1;

import android.icu.text.Normalizer;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView eclair = (ImageView) findViewById(R.id.eclair);
        eclair.setTranslationY(-3000);

        ImageView froyo = (ImageView) findViewById(R.id.froyo);
        froyo.setTranslationX(-3000);

        ImageView gingerbread = (ImageView) findViewById(R.id.gingerbread);
        gingerbread.setTranslationY(3000);

        ImageView honeycomb = (ImageView) findViewById(R.id.honeycomb);
        honeycomb.animate().translationYBy(-3000f).setDuration(1000);
        honeycomb.animate().translationXBy(-3000f).setDuration(1000);

        ImageView iceCream = (ImageView) findViewById(R.id.iceCream);
        iceCream.animate().translationXBy(3000).setDuration(1000);

        ImageView jellybean = (ImageView) findViewById(R.id.jellybean);
        jellybean.animate().translationYBy(-3000f).setDuration(2000);
        jellybean.animate().translationXBy(-3000f).setDuration(2000);

        ImageView kitkat = (ImageView) findViewById(R.id.kitkat);
        kitkat.animate().translationXBy(-3000f).setDuration(2000);

        ImageView lollipop = (ImageView) findViewById(R.id.lollipop);
        lollipop.animate().translationXBy(3000f).setDuration(2000);
        lollipop.animate().rotationYBy(-1000f).setDuration(2000);

        ImageView marshmallow = (ImageView) findViewById(R.id.marshmallow);
        marshmallow.animate().alpha(0).setDuration(2000);
        marshmallow.animate().rotationXBy(-2000).setDuration(2000);

    }

    public void fadeCupcake(View view) {
        ImageView cupcake = (ImageView) findViewById(R.id.cupcake);
        ImageView donut = (ImageView) findViewById(R.id.donut);
        Button startBtn = (Button) findViewById(R.id.startBtn);
        Button btn1 = (Button) findViewById(R.id.btn1);

        cupcake.animate().alpha(0f).setDuration(2000);
        donut.animate().alpha(1f).setDuration(2000);

        startBtn.setEnabled(false);
        startBtn.setVisibility(View.INVISIBLE);

        btn1.setEnabled(true);
        btn1.setVisibility(View.VISIBLE);
    }

    public void moveDonut(View view) {
        ImageView eclair = (ImageView) findViewById(R.id.eclair);
        ImageView donut = (ImageView) findViewById(R.id.donut);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);

        donut.animate().translationXBy(1000f).setDuration(2000);
        eclair.setVisibility(View.VISIBLE);
        eclair.animate().translationYBy(3000f).setDuration(2000);

        btn1.setEnabled(false);
        btn1.setVisibility(View.INVISIBLE);

        btn2.setEnabled(true);
        btn2.setVisibility(View.VISIBLE);
    }

    public void moveEclair(View view){
        ImageView eclair = (ImageView) findViewById(R.id.eclair);
        ImageView froyo = (ImageView) findViewById(R.id.froyo);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);

        eclair.animate().translationYBy(-3000f).setDuration(2000);
        froyo.setVisibility(View.VISIBLE);
        froyo.animate().translationXBy(3000f).setDuration(2000);

        btn2.setEnabled(false);
        btn2.setVisibility(View.INVISIBLE);

        btn3.setEnabled(true);
        btn3.setVisibility(View.VISIBLE);

    }

    public void moveFroyo (View view){
        ImageView froyo = (ImageView) findViewById(R.id.froyo);
        ImageView gingerbread = (ImageView) findViewById(R.id.gingerbread);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);

        froyo.animate().rotationYBy(1000f).setDuration(3000);
        froyo.animate().translationYBy(3000f).setDuration(4000);
        gingerbread.setVisibility(View.VISIBLE);
        gingerbread.animate().translationYBy(-3000f).setDuration(2000);

        btn3.setEnabled(false);
        btn3.setVisibility(View.INVISIBLE);

        btn4.setEnabled(true);
        btn4.setVisibility(View.VISIBLE);

    }

    public void moveGingerbread (View view){
        ImageView honeycomb = (ImageView) findViewById(R.id.honeycomb);
        ImageView gingerbread = (ImageView) findViewById(R.id.gingerbread);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);

        gingerbread.animate().translationXBy(3000f).setDuration(4000);
        gingerbread.animate().rotationYBy(-1000f).setDuration(3000);
        honeycomb.setVisibility(View.VISIBLE);
        honeycomb.animate().translationYBy(3000f).setDuration(2000);
        honeycomb.animate().translationXBy(3000f).setDuration(2000);

        btn4.setEnabled(false);
        btn4.setVisibility(View.INVISIBLE);

        btn5.setEnabled(true);
        btn5.setVisibility(View.VISIBLE);

    }

    public void moveHoneycomb (View view){
        ImageView honeycomb = (ImageView) findViewById(R.id.honeycomb);
        ImageView iceCream = (ImageView) findViewById(R.id.iceCream);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);

        iceCream.animate().translationXBy(-3000f).setDuration(3000);
        iceCream.animate().rotationXBy(-1400f).setDuration(2000);
        iceCream.setVisibility(View.VISIBLE);
        honeycomb.animate().translationYBy(3000f).setDuration(2000);
        honeycomb.animate().scaleXBy(1000f);
        honeycomb.animate().scaleYBy(1000f);
        honeycomb.animate().alpha(0).setDuration(1000);

        btn5.setEnabled(false);
        btn5.setVisibility(View.INVISIBLE);

        btn6.setEnabled(true);
        btn6.setVisibility(View.VISIBLE);

    }

    public void moveIcecream (View view){
        ImageView jellybean = (ImageView) findViewById(R.id.jellybean);
        ImageView iceCream = (ImageView) findViewById(R.id.iceCream);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);

        iceCream.animate().translationYBy(-3000f).setDuration(2000);
        jellybean.setVisibility(View.VISIBLE);
        jellybean.animate().translationYBy(3000f).setDuration(2000);
        jellybean.animate().translationXBy(3000f).setDuration(2000);

        btn6.setEnabled(false);
        btn6.setVisibility(View.INVISIBLE);

        btn7.setEnabled(true);
        btn7.setVisibility(View.VISIBLE);

    }

    public void moveJelly (View view){
        ImageView jellyBean = (ImageView) findViewById(R.id.jellybean);
        ImageView kitkat = (ImageView) findViewById(R.id.kitkat);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);

        jellyBean.animate().translationYBy(-3000f).setDuration(2000);
        jellyBean.animate().rotationXBy(-1000f).setDuration(2000);
        kitkat.setVisibility(View.VISIBLE);
        kitkat.animate().translationXBy(3000f).setDuration(2000);

        btn7.setEnabled(false);
        btn7.setVisibility(View.INVISIBLE);

        btn8.setEnabled(true);
        btn8.setVisibility(View.VISIBLE);


    }

    public void moveKitkat (View view){
        ImageView lollipop = (ImageView) findViewById(R.id.lollipop);
        ImageView kitkat = (ImageView) findViewById(R.id.kitkat);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn8 = (Button) findViewById(R.id.btn8);

        lollipop.setVisibility(View.VISIBLE);
        lollipop.animate().translationXBy(-3000f).setDuration(2000);
        lollipop.animate().rotationYBy(1000f).setDuration(2000);
        kitkat.animate().translationYBy(3000).setDuration(2000);

        btn8.setEnabled(false);
        btn8.setVisibility(View.INVISIBLE);

        btn9.setEnabled(true);
        btn9.setVisibility(View.VISIBLE);
    }

    public void moveLollipop (View view){
        ImageView lollipop = (ImageView) findViewById(R.id.lollipop);
        ImageView marshmallow = (ImageView) findViewById(R.id.marshmallow);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button resetbtn = (Button) findViewById(R.id.resetBtn);

        lollipop.animate().translationXBy(-3000f).setDuration(2000);
        marshmallow.animate().alpha(1).setDuration(2000);
        marshmallow.animate().rotationXBy(2000f).setDuration(2000);

        btn9.setEnabled(false);
        btn9.setVisibility(View.INVISIBLE);

        resetbtn.setEnabled(true);
        resetbtn.setVisibility(View.VISIBLE);
    }

    public void resetImages(View view) {
        Button startBtn = (Button) findViewById(R.id.startBtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);
        ImageView cupcake = (ImageView) findViewById(R.id.cupcake);
        ImageView donut = (ImageView) findViewById(R.id.donut);
        ImageView eclair = (ImageView) findViewById(R.id.eclair);
        ImageView froyo = (ImageView) findViewById(R.id.froyo);
        ImageView gingerbread = (ImageView) findViewById(R.id.gingerbread);
        ImageView honeycomb = (ImageView) findViewById(R.id.honeycomb);
        ImageView iceCream = (ImageView) findViewById(R.id.iceCream);
        ImageView jellybean = (ImageView) findViewById(R.id.jellybean);
        ImageView kitkat = (ImageView) findViewById(R.id.kitkat);
        ImageView lollipop = (ImageView) findViewById(R.id.lollipop);
        ImageView marshmallow = (ImageView) findViewById(R.id.marshmallow);

        marshmallow.animate().alpha(0).setDuration(0);
        marshmallow.animate().rotationXBy(-2000f).setDuration(0);

        lollipop.setVisibility(View.INVISIBLE);
        lollipop.animate().rotationYBy(-1000f).setDuration(1000);
        lollipop.animate().translationXBy(6000f).setDuration(1000);

        kitkat.setVisibility(View.INVISIBLE);
        kitkat.animate().translationXBy(-3000).setDuration(1000);
        kitkat.animate().translationYBy(-3000).setDuration(1000);

        jellybean.setVisibility(View.INVISIBLE);
        jellybean.animate().rotationXBy(1000f).setDuration(2000);
        jellybean.animate().translationXBy(-3000f).setDuration(1000);

        iceCream.animate().translationYBy(3000f).setDuration(1000);
        iceCream.animate().translationXBy(3000f).setDuration(1000);
        iceCream.animate().rotationXBy(1400f).setDuration(1000);
        iceCream.setVisibility(View.INVISIBLE);

        honeycomb.setVisibility(View.INVISIBLE);
        honeycomb.animate().translationYBy(-6000f).setDuration(1000);
        honeycomb.animate().translationXBy(-3000f).setDuration(1000);
        honeycomb.animate().scaleXBy(-1000f);
        honeycomb.animate().scaleYBy(-1000f);
        honeycomb.animate().alpha(1).setDuration(1000);

        gingerbread.animate().translationXBy(-3000f).setDuration(1000);
        gingerbread.animate().translationYBy(3000f).setDuration(1000);
        gingerbread.animate().rotationYBy(1000f).setDuration(1000);
        gingerbread.setVisibility(View.INVISIBLE);

        froyo.setVisibility(View.INVISIBLE);
        froyo.animate().rotationYBy(-1000f).setDuration(1000);
        froyo.animate().translationYBy(-3000f).setDuration(1000);
        froyo.animate().translationXBy(-3000f).setDuration(1000);

        eclair.setVisibility(View.INVISIBLE);
        eclair.setTranslationY(-3000);

        donut.setAlpha(0f);
        donut.animate().translationX(0f).setDuration(0);

        cupcake.setAlpha(1f);

        // We hide and disable the reset button so it won't troubles us further
        resetBtn.setEnabled(false);
        resetBtn.setVisibility(View.INVISIBLE);

        // We show and enable the first button so we can run our animations again
        startBtn.setEnabled(true);
        startBtn.setVisibility(View.VISIBLE);
    }

}