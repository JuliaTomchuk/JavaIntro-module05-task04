package my.home.task04.entity;

import java.util.ArrayList;
import java.util.List;

public class Cave {

	private List<Treasure> treasures;

	public Cave() {

		treasures = new ArrayList<>();
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public void addTreasure(Treasure treasure) {
		treasures.add(treasure);
	}

	public Treasure getTreasure(int index) {
		return treasures.get(index);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cave other = (Cave) obj;
		if (treasures == null) {
			if (other.treasures != null)
				return false;
		} else if (!treasures.equals(other.treasures))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[treasures=" + treasures + "]";
	}

}
