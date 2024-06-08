package duypvph46.fpoly.lab7_ph35546

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import duypvph46.fpoly.lab7_ph35546.BaiTap.ScreenNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            Bai1()
            ScreenNavigation()
        }
    }
}