package local.pirple.vehicle.classes

class Cars(make: String, model: String, year: Int, weight: Double): Vehicle(make, model, year, weight) {
    var isDriving = false

    fun drive() { isDriving = true }

    fun stop() {
        isDriving = false
        needsMaintenance = ++ tripsSinceMaintenance > 100
    }

    override fun toString(): String {
        return super.toString() +  " |  Cars(isDriving=$isDriving)"
    }
}