/*
BeerSong.java
F Heffernan
07Oct18
*/

public class BeerSong{

	public static void main(String args[]){

		int beerNum=99;

		String word ="bottles";

		while (beerNum > 0){

			if (beerNum == 1){
				word = "bottle";
			}

		System.out.println(beerNum + " " + word +" of beer");

		beerNum= beerNum-1;

		System.out.println("Take one down, pass it around");

		if ( beerNum > 0) {

			System.out.println(beerNum + " " + word + " of beer on the wall");
			}
		else {

			System.out.println("No more bottles of beer on the wall");
			}

			}
		}
	}