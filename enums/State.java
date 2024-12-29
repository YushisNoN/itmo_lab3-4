package enums;

public enum State {
    
    SIGNING("Поющие"),
    DEMONIC("Демонические");

    private String state;
    State(String state){
        this.state = state;
    }

    @Override
    public String toString(){
        return this.state;
    }
}
