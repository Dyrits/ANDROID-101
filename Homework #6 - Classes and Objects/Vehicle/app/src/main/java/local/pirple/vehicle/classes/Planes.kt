package local.pirple.vehicle.classes

import android.util.Log

class Planes(make: String, model: String, year: Int, weight: Double): Vehicle(make, model, year, weight){
    var isFlying = false

    fun fly(): Boolean {
        if (needsMaintenance) Log.e("PLANE", "The plane can't fly until it has been repaired.") else isFlying = true
        return isFlying
    }

    fun land() {
        if (isFlying)  {
            isFlying = false
            needsMaintenance = ++ tripsSinceMaintenance > 100
        }
    }

    override fun toString(): String {
        return super.toString() + " | Planes(isFlying=$isFlying)"
    }
}