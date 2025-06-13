package OOP.MOCK_Paper.Question2_2;

public class Engine {

    private String engineType; // bus kiyanawa oyage engine type rka "diesel" kiyala

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
