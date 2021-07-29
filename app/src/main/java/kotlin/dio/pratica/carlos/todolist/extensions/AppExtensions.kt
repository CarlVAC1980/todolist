package kotlin.dio.pratica.carlos.todolist.extensions

import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.*

private val locale = Locale("pt", "BR")

fun Date.format() : String {
    return SimpleDateFormat("dd/mm/yyyy", locale).format(this)
}

var TextInputLayout.text : String
    get() = editText?.toString() ?: ""
    set(value) {
        editText
    }