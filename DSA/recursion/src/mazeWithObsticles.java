public class mazeWithObsticles {

    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},    // add false at the middel for obsticle
                {true,true,true},


        };
        //pathObsticles("",board,0,0);

        pathBcakTrack("", board,0,0);


    }

    static void pathObsticles(String p, boolean[][] maze, int r, int c){
        if(r ==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathObsticles(p+'D',maze,r +1,c);

        }
        if(c<maze[0].length-1){
            pathObsticles(p+'R', maze,r, c+1);
        }


    }

    static void pathBcakTrack(String p, boolean[][] maze, int r, int c){
        if(r ==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        // i am considering this path in my path
        maze[r][c] = false;

        if(r<maze.length-1){
            pathBcakTrack(p+'D',maze,r +1,c);

        }
        if(c<maze[0].length-1){
            pathBcakTrack(p+'R', maze,r, c+1);
        }
        if(r>0){
            pathBcakTrack(p+'U',maze,r-1,c);
        }
        if(c>0){
            pathBcakTrack(p+'L',maze,r,c-1);
        }


        // this line is where the function will be over
        // so before the function gets remove, also remove he changes that were made by that function
        maze[r][c] = true;


    }



}
