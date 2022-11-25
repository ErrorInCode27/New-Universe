package newuniverse.content

import arc.func.Prov
import mindustry.content.Planets
import mindustry.graphics.g3d.HexMesh
import mindustry.type.*

class NewUniversePlanets {

    fun load(){
        stracis = Planet("stracis", Planets.serpulo, 1f, 2).apply {
            meshLoader = Prov { HexMesh(this, 4) }
            accessible = false
            visible = true
            tidalLock = true
            hasAtmosphere = true
            orbitSpacing = 6f
        }
    }

    companion object{
        lateinit var stracis: Planet
        lateinit var kotloon: Planet
    }
}