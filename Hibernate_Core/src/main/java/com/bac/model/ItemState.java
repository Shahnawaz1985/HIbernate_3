package com.bac.model;

public enum ItemState {
	DRAFT('D'), PENDING('P'), ACTIVE('A');

    private final char state;

	private ItemState(char state) {
		this.state = state;
	}

    public char value() {
        return state;
    }

	public String toString() {
		return Character.toString(state);
	}
}
