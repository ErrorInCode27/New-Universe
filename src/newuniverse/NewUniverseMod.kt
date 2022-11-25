package newuniverse

import arc.util.*
import mindustry.content.Planets
import mindustry.mod.*
import newuniverse.content.NewUniversePlanets

class NewUniverseMod : Mod(){

    init{
        Log.info("Loaded New Universe mod constructor.")
    }

    override fun loadContent(){
        Log.info("Loading New Universe planets.")
        NewUniversePlanets().load()
        Planets.tantros.visible = true
        Log.info("Loaded New Universe planets.")
    }
}
