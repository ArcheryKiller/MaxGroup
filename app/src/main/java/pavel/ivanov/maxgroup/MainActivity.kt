package pavel.ivanov.maxgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pavel.ivanov.maxgroup.databinding.ActivityMainBinding
import pavel.ivanov.maxgroup.ui.AuthorizationFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AuthorizationFragment())
                .commit()
        }
    }
}