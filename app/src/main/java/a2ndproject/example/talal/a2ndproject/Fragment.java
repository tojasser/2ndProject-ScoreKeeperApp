package a2ndproject.example.talal.a2ndproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by talal on 13/04/18.
 */

public class Fragment extends android.support.v4.app.Fragment {
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main, container,false);
        return view;
    }


    // total points for team1
    public int CCpoint;

    // total points for team2
    public int CHpoint;

    // +1 point for team 1
    public void oneCC(View view) {
        CCpoint++;
        displayCC();
    }

    // +2 point for team 1
    public void twoCC(View view) {
        CCpoint+=2;
        displayCC();
    }
    //+3point for team1
    public void threeCC(View view) {
        CCpoint+=3;
        displayCC();
    }
    // score keeper for team1
    public void displayCC(){
        TextView team1=view.findViewById(R.id.team_a_score);
        team1.setText(""+CCpoint);
    }

    // +1point for team2
    public void oneCH(View view) {
        CHpoint++;
        displayCH();
    }
    // +2point for team2
    public void twoCH(View view) {
        CHpoint+=2;
        displayCH();
    }
    // +3 point for team2
    public void threeCH(View view) {
        CHpoint+=3;
        displayCH();
    }
    //score keeper for team3
    public void displayCH(){
        TextView team2=view.findViewById(R.id.team_b_score);
        team2.setText(""+CHpoint);
    }
    // Reset button
    public void reset(View view) {
        CCpoint=0;
        CHpoint=0;
        displayCH();
        displayCC();
    }

}
