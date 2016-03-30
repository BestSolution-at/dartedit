package at.bestsolution.dart.editor.services.pair;

import java.util.List;
import java.util.Optional;

import org.eclipse.jface.text.IRegion;

public interface PairType {

	public static enum PairSide {
		LEFT,
		RIGHT;

		public PairSide getOpposite() {
			return this == LEFT ? RIGHT : LEFT;
		}
	}

	public static class Pair {
		private PairType type;
		private PairSide side;
		private IRegion region;
		private Pair opposite;

		public PairType getType() {
			return type;
		}

		public PairSide getSide() {
			return side;
		}
		public IRegion getRegion() {
			return region;
		}
		public Pair getOpposite() {
			return opposite;
		}

		private Pair(PairType type, PairSide side, IRegion region) {
			this.type = type;
			this.side = side;
			this.region = region;
		}

		public static Pair create(PairType type, PairSide side, IRegion region, IRegion opposite) {
			Pair pair = new Pair(type, side, region);
			Pair oppositePair = new Pair(type, side.getOpposite(), opposite);
			pair.opposite = oppositePair;
			oppositePair.opposite = pair;
			return pair;
		}

		@Override
		public String toString() {
			return "Pair"+side+"@" + region;
		}
	}

	Optional<Pair> getPairAtOffset(int offset);
	List<Pair> getPairsInLine(int lineIndex);

}
