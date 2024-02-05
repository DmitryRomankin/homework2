import Classes.ItemGenerator;

public class GoldFabric extends ItemGenerator {
    @Override
    public Classes.IGameItem createItem() {
        return new Gold();
    }
}