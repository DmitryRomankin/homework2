import Classes.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public Classes.IGameItem createItem() {
        return new Sapphire();
    }
}