package www.iesmurgi.u5_proyecto4edittext_fichaalumno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import www.iesmurgi.u5_proyecto4edittext_fichaalumno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Le ponemos los inputType
        binding.etNombreAp.inputType = InputType.TYPE_CLASS_TEXT +InputType.TYPE_TEXT_VARIATION_PERSON_NAME + InputType.TYPE_TEXT_FLAG_CAP_WORDS
        binding.etCalle.inputType =InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_FLAG_CAP_SENTENCES
        binding.etNumero.inputType = InputType.TYPE_CLASS_NUMBER
        binding.etCPostal.inputType = InputType.TYPE_CLASS_NUMBER
        binding.etLocalidad.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_FLAG_CAP_WORDS
        binding.etCiudad.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_FLAG_CAP_WORDS
        binding.etTelefono.inputType = InputType.TYPE_CLASS_PHONE
        binding.etTelefonoUrgencias.inputType = InputType.TYPE_CLASS_PHONE
        binding.etNombrePadre.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_VARIATION_PERSON_NAME + InputType.TYPE_TEXT_FLAG_CAP_WORDS
        binding.etNombreMadre.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_VARIATION_PERSON_NAME + InputType.TYPE_TEXT_FLAG_CAP_WORDS
        binding.etPagina.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_VARIATION_URI
        binding.etFecha.inputType = InputType.TYPE_CLASS_DATETIME
        binding.etAltura.inputType = InputType.TYPE_CLASS_NUMBER + InputType.TYPE_NUMBER_FLAG_DECIMAL
        binding.etDescripcion.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_FLAG_CAP_SENTENCES
        binding.etEmail.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
        binding.etAlergias.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_FLAG_MULTI_LINE
        binding.etPassword.inputType = InputType.TYPE_CLASS_TEXT + InputType.TYPE_TEXT_VARIATION_PASSWORD
        setContentView(binding.root)


    }


}