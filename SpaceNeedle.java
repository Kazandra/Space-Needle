/**
 * 
 */

/**
 * @author kazandra
 *
 */
public class SpaceNeedle {
	//this is my class constant
	public static final int NeedleSize = 4;
 
    public static void main(String[] Args){
    	//Below are function names to help me separate parts of the Space Needle and make my life easier.
    	
        Needlepoint();
        TopCircle();
        CenterCircle();
        BottomCircle();
        Neck();
        Middle();
        Base();
        Foundation();

    }


	public static void Needlepoint(){

        //This is just for the needle for the space needle
        for(int i=1; i<=NeedleSize; i++){
            for(int j=1; j<=(3*NeedleSize); j++){
                System.out.print(" ");
            }

            System.out.print("||");

            for(int j=1; j<=(3*NeedleSize); j++){
                System.out.print(" ");
            }

            System.out.println();

        }

    }

    public static void TopCircle(){
    	//This is for the bottom of the space needle
        for(int line=1; line <= NeedleSize; line++){

            for(int i=1; i<=((3*NeedleSize)-(3*line)); i++){
                System.out.print(" ");
            }
            System.out.print("__/");

            for(int i=1; i<=((3*line)-(3)); i++){
                System.out.print(":");
            }
            System.out.print("||");
            for(int i=1; i<=((3*line)-(3)); i++){
                System.out.print(":");
            }

            System.out.print("\\__");

            System.out.println();
            }

    }


    public static void CenterCircle(){

        //this is for the top part of the space needle, right below the needle
        System.out.print("|");

        for(int i=1; i<=6*NeedleSize; i++){
            System.out.print("\"");

        }

        System.out.print("|");

        System.out.println();

    }


    public static void BottomCircle(){

        //this is for the bottom half of the circle below the needle
        for(int line=1; line <= NeedleSize; line++){

            for(int i=1; i<=(2*line)-2; i++){
                System.out.print(" ");
            }

            System.out.print("\\_");

            for(int j=1; j<=(((3*NeedleSize)+1) - (2*line)); j++){
               System.out.print("/\\");
            }

            System.out.print("_/");

            System.out.println();

        }

    }

    public static void Neck(){
    	//This is for the awkward neck the space needle has
    	//I used the same code from the needle point section
    	for(int i=1; i<=NeedleSize; i++){
            for(int j=1; j<=(3*NeedleSize); j++){
                System.out.print(" ");
            }

            System.out.print("||");

            for(int j=1; j<=(3*NeedleSize); j++){
                System.out.print(" ");
            }

            System.out.println();

        }
    }
    
    
    public static void Middle(){
    	//this is for the middle %% section for the space needle

        for(int line=1; line <= NeedleSize * NeedleSize; line++){

            for(int j=1; j<=(3*NeedleSize)-3; j++){
                System.out.print(" ");
            }

            System.out.println("|%%||%%|");

        }

    }
    public static void Base() {
    	//This is for the bottom base of the space needle
    	//used same code from top circle section
    	for(int line=1; line <= NeedleSize; line++){

            for(int i=1; i<=((3*NeedleSize)-(3*line)); i++){
                System.out.print(" ");
            }
            System.out.print("__/");

            for(int i=1; i<=((3*line)-(3)); i++){
                System.out.print(":");
            }
            System.out.print("||");
            for(int i=1; i<=((3*line)-(3)); i++){
                System.out.print(":");
            }

            System.out.print("\\__");

            System.out.println();
            }
	}
    public static void Foundation() {
    	//this is the bottom of the space needle
    	//used same code from the center circle section
    	System.out.print("|");

        for(int i=1; i<=6*NeedleSize; i++){
            System.out.print("\"");

        }

        System.out.print("|");

        System.out.println();
    }

}



