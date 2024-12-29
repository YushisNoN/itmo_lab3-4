package location;

import enums.Population;
import enums.Volume;

public abstract class Location {
    private String name;
    public Volume volume;
    protected Population population;
    public Location(String name, Volume volume){
        this.name = name;
        this.volume = volume;
    }

    public Population getPopulation(){
        return this.population;
    }

    public void setPopulation(Population population){
        this.population = population;
    }

    @Override
    public String toString(){
        return this.name;
    }


    public boolean equals(Location location){
        if(this.equals(location.toString())){
            if(this.volume.equals(location.volume))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode() + this.population.hashCode();
    }

}
