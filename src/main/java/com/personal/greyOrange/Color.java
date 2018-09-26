package com.personal.greyOrange;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Enum Color.
 */
public enum Color {

	/** The red. */
	RED(1),
	/** The yellow. */
	YELLOW(2),
	/** The blue. */
	BLUE(3),
	/** The green. */
	GREEN(4);

	/** The destination id. */
	private int destinationId;

	/**
	 * Instantiates a new color.
	 *
	 * @param destinationId
	 *            the destination id
	 */
	private Color(int destinationId) {
		this.destinationId = destinationId;
	}

	/**
	 * Gets the destination id.
	 *
	 * @return the destination id
	 */
	public int getDestinationId() {
		return destinationId;
	}

	public static Color valueOfInteger(int i) {
		return Arrays.asList(Color.values()).stream().filter(c -> c.getDestinationId() == i).findFirst().orElse(null);
	}

}
