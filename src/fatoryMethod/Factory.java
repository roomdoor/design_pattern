package fatoryMethod;

public abstract class Factory {

	public Item create(String name) {
		if (this.isCreatable(name)) {
			Item item = this.createItem(name);
			this.postProcess(name);
			return item;
		}
		return null;
	}

	public abstract boolean isCreatable(String name);

	public abstract Item createItem(String name);

	public abstract void postProcess(String name);
}
