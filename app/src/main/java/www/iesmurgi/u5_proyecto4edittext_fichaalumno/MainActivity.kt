package www.iesmurgi.u5_proyecto4edittext_fichaalumno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import www.iesmurgi.u5_proyecto4edittext_fichaalumno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Le ponemos los inputType
        binding.etNombreAp.inputType = InputType.TYPE_TEXT_VARIATION_PERSON_NAME
        binding.etCalle.inputType = InputType.TYPE_TEXT_FLAG_CAP_SENTENCES
        binding.etNumero.inputType = InputType.TYPE_CLASS_NUMBER
        binding.etCPostal.inputType = InputType.TYPE_CLASS_NUMBER
        binding.etLocalidad.inputType = InputType.TYPE_CLASS_TEXT
        binding.etCiudad.inputType = InputType.TYPE_CLASS_TEXT
        binding.etTelefono.inputType = InputType.TYPE_CLASS_PHONE
        binding.etTelefonoUrgencias.inputType = InputType.TYPE_CLASS_PHONE
        binding.etNombrePadre.inputType = InputType.TYPE_TEXT_VARIATION_PERSON_NAME
        binding.etNombreMadre.inputType = InputType.TYPE_TEXT_VARIATION_PERSON_NAME
        binding.etPagina.inputType = InputType.TYPE_TEXT_VARIATION_URI
        binding.etFecha.inputType = InputType.TYPE_CLASS_DATETIME
        binding.etAltura.inputType = InputType.TYPE_CLASS_NUMBER
        binding.etDescripcion.inputType = InputType.TYPE_CLASS_TEXT
        //No funciona desde el main, lo he hecho en el xml
        //binding.etEmail.inputType = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
        //binding.etAlergias.inputType = InputType.TYPE_TEXT_FLAG_MULTI_LINE
        setContentView(binding.root)
    }
}