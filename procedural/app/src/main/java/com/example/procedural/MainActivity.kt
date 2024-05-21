import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var countTextView: TextView
    private lateinit var incrementButton: Button
    private lateinit var decrementButton: Button
    private lateinit var resetButton: Button

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.countTextView)
        incrementButton = findViewById(R.id.incrementButton)
        decrementButton = findViewById(R.id.decrementButton)
        resetButton = findViewById(R.id.resetButton)

        incrementButton.setOnClickListener(this)
        decrementButton.setOnClickListener(this)
        resetButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.incrementButton -> incrementCount()
            R.id.decrementButton -> decrementCount()
            R.id.resetButton -> resetCount()
        }
    }

    private fun incrementCount() {
        count++
        updateCount()
    }

    private fun decrementCount() {
        if (count > 0) {
            count--
            updateCount()
        }
    }

    private fun resetCount() {
        count = 0
        updateCount()
    }

    private fun updateCount() {
        countTextView.text = count.toString()
    }
}