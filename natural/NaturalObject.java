package natural;

import enums.NaturalTypes;

public abstract class NaturalObject {
    private String name;
    private int size;
    private NaturalTypes type;

    public NaturalObject(String name, int size, NaturalTypes type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public NaturalTypes getType() {
        return this.type;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public boolean equals(NaturalObject obj) {
        if (this.name.equals(obj.toString())) {
            if ((this.type.equals(obj.getType())) && (this.size == obj.size))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.type.hashCode();
    }
}
