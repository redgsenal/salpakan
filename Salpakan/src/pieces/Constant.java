package pieces;

import java.util.ArrayList;
import java.util.Arrays;

public final class Constant {
	
	
	// rank values
	public static final int FLAG_VALUE = 1;
	public static final int FIVE_STAR_GENERAL_VALUE = 15;
	public static final int FOUR_STAR_GENERAL_VALUE = 14;
	public static final int LIEUTENANT_GENERAL_VALUE = 13;
	public static final int MAJOR_GENERAL_VALUE = 12;
	public static final int BRIGADIER_GENERAL_VALUE = 11;
	public static final int COLONEL_VALUE = 10;
	public static final int LIEUTENANT_COLONEL_VALUE = 9;
	public static final int MAJOR_VALUE = 8;
	public static final int CAPTAIN_VALUE = 7;
	public static final int FIRST_LIEUTENANT_VALUE = 6;
	public static final int SECOND_LIEUTENANT_VALUE = 5;
	public static final int SERGENT_VALUE = 4;
	public static final int PRIVATE_VALUE = 3;
	public static final int SPY_VALUE = 2;
	
	// rank order
	public static final ArrayList<Integer> FLAG_LESSER_RANKS = new ArrayList<Integer>();
	public static final ArrayList<Integer> FIVE_STAR_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			FOUR_STAR_GENERAL_VALUE, 
			LIEUTENANT_GENERAL_VALUE, 
			MAJOR_GENERAL_VALUE, 
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> FOUR_STAR_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			LIEUTENANT_GENERAL_VALUE, 
			MAJOR_GENERAL_VALUE, 
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> LIEUTENANT_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			MAJOR_GENERAL_VALUE, 
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> MAJOR_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> BRIGADIER_GENERAL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> COLONEL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> LIEUTENANT_COLONEL_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> MAJOR_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> CAPTAIN_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> FIRST_LIEUTENANT_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> SECOND_LIEUTENANT_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			SERGENT_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> SERGENT_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			PRIVATE_VALUE));
	public static final ArrayList<Integer> PRIVATE_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			SPY_VALUE));
	public static final ArrayList<Integer> SPY_LESSER_RANKS = new ArrayList<Integer>(Arrays.asList(
			FLAG_VALUE,
			FIVE_STAR_GENERAL_VALUE, 
			FOUR_STAR_GENERAL_VALUE, 
			LIEUTENANT_GENERAL_VALUE, 
			MAJOR_GENERAL_VALUE, 
			BRIGADIER_GENERAL_VALUE, 
			COLONEL_VALUE, 
			LIEUTENANT_COLONEL_VALUE, 
			MAJOR_VALUE,
			CAPTAIN_VALUE,
			FIRST_LIEUTENANT_VALUE,
			SECOND_LIEUTENANT_VALUE,
			SERGENT_VALUE));
	
	public static final int MAX_BOARD_X = 8;
	public static final int MAX_BOARD_Y = 9;
	
	public static TilePiece FLAG = new TilePiece("Flag", FLAG_VALUE, FLAG_LESSER_RANKS);
	public static TilePiece FIVE_STAR_GENERAL = new TilePiece("5 Star General", FIVE_STAR_GENERAL_VALUE, FIVE_STAR_GENERAL_LESSER_RANKS);
	public static TilePiece FOUR_STAR_GENERAL = new TilePiece("4 Star General", FOUR_STAR_GENERAL_VALUE, FOUR_STAR_GENERAL_LESSER_RANKS);
	public static TilePiece LIEUTENANT_GENERAL = new TilePiece("Lieutenant General", LIEUTENANT_GENERAL_VALUE, LIEUTENANT_GENERAL_LESSER_RANKS);
	public static TilePiece MAJOR_GENERAL = new TilePiece("Major General", MAJOR_GENERAL_VALUE, MAJOR_GENERAL_LESSER_RANKS);
	public static TilePiece BRIGADIER_GENERAL = new TilePiece("Brigadier General", BRIGADIER_GENERAL_VALUE, BRIGADIER_GENERAL_LESSER_RANKS);
	public static TilePiece COLONEL = new TilePiece("Colonel", COLONEL_VALUE, COLONEL_LESSER_RANKS);
	public static TilePiece LIEUTENANT_COLONEL = new TilePiece("Lieutenant Colonel", LIEUTENANT_COLONEL_VALUE, LIEUTENANT_COLONEL_LESSER_RANKS);
	public static TilePiece MAJOR = new TilePiece("Major", MAJOR_VALUE, MAJOR_LESSER_RANKS);
	public static TilePiece CAPTAIN = new TilePiece("Captain", CAPTAIN_VALUE, CAPTAIN_LESSER_RANKS);
	public static TilePiece FIRST_LIEUTENANT = new TilePiece("First Lieutenant", FIRST_LIEUTENANT_VALUE, FIRST_LIEUTENANT_LESSER_RANKS);
	public static TilePiece SECOND_LIEUTENANT = new TilePiece("Second Lieutenant", SECOND_LIEUTENANT_VALUE, SECOND_LIEUTENANT_LESSER_RANKS);
	public static TilePiece SERGENT = new TilePiece("Sergent", SERGENT_VALUE, SERGENT_LESSER_RANKS);
	public static TilePiece PRIVATE = new TilePiece("Private", PRIVATE_VALUE, PRIVATE_LESSER_RANKS);
	public static TilePiece SPY = new TilePiece("Spy", SPY_VALUE, SPY_LESSER_RANKS);
	
	//Spublic static ArrayList<TilePiece> TILE_PIECES = new ArrayList<TilePiece>(Arrays.asList("Buenos Aires", "C�rdoba", "La Plata")));

}
