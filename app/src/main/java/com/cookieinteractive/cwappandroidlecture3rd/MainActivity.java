package com.cookieinteractive.cwappandroidlecture3rd;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // linearA 라는 LinearLayout 형의 변수를 생성하고 activity_main 라는 view 를 찾아서 해당 뷰 (activity_main)의 R.id 값을 변수에 할당한다.
        LinearLayout linearA = (LinearLayout) findViewById(R.id.activity_main);
        //방금 생성한 linearA 변수의 배경색 프로퍼티를 RED 로 바꾼다.
        linearA.setBackgroundColor(Color.RED);

        // btnA 라는 Button 형의 변수를 만들고, xml 의 button2 의 id 값을 할당한다.
        Button btnA = (Button) findViewById(R.id.button2);

        //  LinearLayout 형의 LayoutParams 형의 paramA  변수를 생성하고, 프로퍼티를 (-1, -2) 로 설정한다.
        LinearLayout.LayoutParams paramA = new LinearLayout.LayoutParams(-1, -2);
        // 상기 -1 은 LinearLayout.LayoutParams.MATCH_PARENT 의 상수값이다. -2 는 wrap content 이다.
        // 방금 생성한 paramA 의 여백 프로퍼티를 (30, 30, 30, 30) 으로 설정한다.
        paramA.setMargins(30, 30, 30, 30);
        // 버튼 btnA 의 레이아웃 파라미터를 paramA 로 설정한다.
        btnA.setLayoutParams(paramA);


        // 아래 버튼은 activity_main.xml 에서 생성하고, findViewById 로 버튼과 변수를 연결하는 것이 아니라,
        // 코딩으로 생성한 버튼을  View 에 갖다 붙인다.

        // Button 형의 변수 btnB 를 생성한다.
        Button btnB = new Button(this);
        // 상기와 같이 레이아웃 파라미터를 만든다.
        LinearLayout.LayoutParams paramB = new LinearLayout.LayoutParams(-2, -2);
        // 위와 같음.
        btnB.setPadding(30, 30, 30, 30);
        // 위와 같음.
        btnB.setLayoutParams(paramB);
        // btnB 의 텍스트를 Button B 로 설정한다.
        btnB.setText("Button B");
        // linearA 레이아웃에 btnB 를 갖다 붙인다.
        linearA.addView(btnB);
    }
}
