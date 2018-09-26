package com.personal.greyOrange;

// TODO: Auto-generated Javadoc
/**
 * The Class Ball.
 */
public class Ball {

	/** The id. */
	private Integer id;

	/** The color. */
	private Color color;

	/**
	 * Instantiates a new ball.
	 *
	 * @param id
	 *            the id
	 */
	public Ball(Integer id) {
		this.id = id;
	}

	/**
	 * Assign color.
	 *
	 * @param color
	 *            the color
	 */
	public void assignColor(Color color) {
		this.color = color;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ball [id=" + id + ", color=" + color + "]";
	}

	public Integer getId() {
		return id;
	}

}
