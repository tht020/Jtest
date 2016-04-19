package tests;

import android.test.ActivityInstrumentationTestCase2;
import com.example.yt.testingapp.R;
import com.example.yt.testingapp.MainActivity;
import android.widget.TextView;

/**
 * Created by YT on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }
    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
