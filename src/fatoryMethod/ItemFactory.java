package fatoryMethod;

import java.util.HashMap;

public class ItemFactory extends Factory {

	private class ItemData {
		int maxCount;
		int curCount;
		ItemData (int maxCount) {
			this.maxCount = maxCount;
		}
	}

	private HashMap<String, ItemData> repository;

	public ItemFactory() {
		repository = new HashMap<>();

		repository.put("sword", new ItemData(3));
		repository.put("shield", new ItemData(2));
	}

	@Override
	public boolean isCreatable(String name) {
		ItemData itemData = repository.get(name);
		if(itemData == null) {
			System.out.println(name + "은 생산할 수 있는 아이템이 아닙니다.");
			return false;
		}
		if(itemData.maxCount <= itemData.curCount) {
			System.out.println(name + "은 품절된 아이템입니다. 더 생산할 수 없습니다.");
			return false;
		}
		return true;
	}

	@Override
	public Item createItem(String name) {
		switch (name) {
			case "sword" :
				return new Sword();

			case "shield" :
				return new Shield();
		}

		return null;
	}

	@Override
	public void postProcess(String name) {
		ItemData itemData = repository.get(name);
		if(itemData !=null) {
			itemData.curCount++;
		}
	}
}
