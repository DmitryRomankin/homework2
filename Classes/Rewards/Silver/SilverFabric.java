import Classes.IGameItem;

public class SilverFabric extends Classes.ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}