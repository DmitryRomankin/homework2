import Classes.ItemGenerator;

public class GemFabric extends ItemGenerator {
    @Override
    public Classes.IGameItem createItem() {
        return new Gem();
    }
}