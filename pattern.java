public class pattern {
     //Define the method here
  public static void numberPattern(int num)
		{
			int leftSide = 1;
			int rightSide = (num * num) + 1;
			int spaces = 0;
			for (int numOfLines = num; numOfLines >= 1; numOfLines--) {
				for (int spacesCounter = spaces; spacesCounter >= 1; spacesCounter--) {
					System.out.print(" ");
				}
				for (int leftSideCounter = 1; leftSideCounter <= numOfLines; leftSideCounter++) {
					if (leftSideCounter == numOfLines)
						System.out.print((leftSide++));
					else
						System.out.print((leftSide++) + "*");
				}
				for (int rightSideCounter = 1; rightSideCounter <= numOfLines; rightSideCounter++) {
					System.out.print("*" + (rightSide++));
				}
				System.out.println();
				spaces += 2;
				rightSide = (rightSide - 1) - ((numOfLines - 1) * 2);
			}
		}
    public static void main(String args[]) {
      numberPattern(4);
     }
    }4