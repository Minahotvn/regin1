package com.mralevas.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    int start_x = 0; // координата Х при нажатии
    int end_x = 0; // координата Х при отпуске

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){ //определение матода

            case MotionEvent.ACTION_UP: // если нажатие
                start_x = (int) event.getX();// определяем координату Х
                break; // конец
            case MotionEvent.ACTION_DOWN: // если отжатие
                end_x =(int) event.getX(); // определите координату X
                break;
        }

        if(start_x !=0 && end_x != 0){ // если координата не 0
            if(start_x > end_x) { // если начальная координата больше конечной
                // свайп влево
                setContentView(R.layout.activity_main); // меняем экран
            } else if (start_x < end_x) {
                //свайп вправо
                setContentView(R.layout.regin); // меняем экран
            }

            start_x = 0; // обнуляем координаты
            end_x = 0; // обнуляем координаты
        }
        return false;

    }
}