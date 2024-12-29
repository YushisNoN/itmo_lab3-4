package enums;

public enum Population {
    SMALL("Маленький"),
    NONE("Пустой"),
    AVERAGE("Средненаселенный"),
    DENSELY("Густонаселенный");

    private String population;
    Population(String population){
        this.population = population;
    }

    @Override
    public String toString() {
        return this.population;
    }
    
}
