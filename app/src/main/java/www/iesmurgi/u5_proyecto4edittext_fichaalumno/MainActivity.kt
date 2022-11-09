package www.iesmurgi.u5_proyecto4edittext_fichaalumno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import www.iesmurgi.u5_proyecto4edittext_fichaalumno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.text.layout.width
        setContentView(binding.root)

    }
}