package com.example.fragments_dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
    final String frag1String = "Fragment1_ID_STRING";
    boolean showButtons = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // start the fragment manager make sure you dont comingle
        // the support library android.support.v4.app.* and
        // the regular fragment library android.app.*
        FragmentManager manager = getSupportFragmentManager();

        // we want a transaction
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(R.id.fragment_container1, new Fragment1(), frag1String);
        transaction.add(R.id.fragment_container2, new Fragment2());

        // either both or neither
        transaction.commit();
        manager.executePendingTransactions();
    }

//    @Override
//    protected void onStart() {
//        // TODO Auto-generated method stub
//        super.onStart();
//
//        // must use fragment manager
//        Fragment1 myFrag1 = (Fragment1) getSupportFragmentManager().findFragmentByTag(frag1String);
//
//        // orig transaction could have failed OR fragment UI is not completely
//        // created
//        if (myFrag1 != null) {
//            View myView = myFrag1.getView();
//            if (myView != null) {
//                TextView myTextView = (TextView) myView.findViewById(R.id.textView1);
//                myTextView.setText("Direct Manipulation");
//            }
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void doChange2(View view) {
        showButtons = !showButtons;

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        if (showButtons)
            transaction.add(R.id.fragment_container2, new Fragment2Radio());
        else
            transaction.add(R.id.fragment_container2, new Fragment2());

        transaction.commit();
        manager.executePendingTransactions();

    }
}
