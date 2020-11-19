package local.pirple.vehicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import local.pirple.vehicle.classes.Cars
import local.pirple.vehicle.classes.Planes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        useVehicles()
    }

    private fun useVehicles() {
        val mercury = Cars("Mercury", "Capri", 1994, 2_500.0)
        val acura = Cars("Acura", "CL", 2002, 3_470.0)
        val chevrolet = Cars("Chevrolet", "Silverado", 1983, 4_200.0)
        val a320 = Planes("Airbus", "A320", 1987, 37_230_000_000.0)
        Log.i("ACURA", acura.toString())
        repeat(110) {
            mercury.drive()
            mercury.stop()
        }
        Log.i("MERCURY", mercury.toString())
        mercury.repair()
        Log.i("MERCURY", mercury.toString())
        repeat(10) {
            chevrolet.drive()
            chevrolet.stop()
        }
        Log.i("CHEVROLET", mercury.toString())
        repeat(125) {
            a320.fly()
            a320.land()
        }
        Log.i("AIRBUS", a320.toString())
    }
}