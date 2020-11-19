package local.pirple.vehicle.classes

open class Vehicle(val make: String, val model: String, val year: Int, val weight: Double) {
    open var needsMaintenance = false
    open var tripsSinceMaintenance = 0

    open fun repair() {
        needsMaintenance = false
        tripsSinceMaintenance = 0
    }

    override fun toString(): String {
        return "Vehicle(make='$make', model='$model', year=$year, weight=$weight, needsMaintenance=$needsMaintenance, tripsSinceMaintenance=$tripsSinceMaintenance)"
    }
}