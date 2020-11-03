package a2;

import java.util.ArrayList;

public class MovieList {
    private ArrayList<String> movieList = new ArrayList<>();

    public void addMovieItem(String item) {
        System.out.println("You have " + movieList.size() + " items in your Movie List");
        for(int i = 0; i < movieList.size(); i++) {
            System.out.println((i+1) + ". " + movieList.get(i));
        }
    }

    public void printMovieList() {
        System.out.println("you have " + movieList.size() + " item in your movie list.");
        for(int i = 0; i < movieList.size(); i ++) {
            System.out.println((i+1) + ". " + movieList.get(i));
        }
    }

    public void modifyMovieItem(int position, String newItem) {
        movieList.set(position, newItem);
        System.out.println("Movie item " + (position+1) + " has been modified.");
    }

    public void removeMovieItem(int position) {
        String theItem = movieList.get(position);
        movieList.remove(position);
        System.out.println("Remove item " + theItem);
    }

    public String findItem(String searchItem) {
//        boolean exists = movieList.contains(searchItem);
        int position = movieList.indexOf(searchItem);
        if(position >= 0) {
            return movieList.get(position);
        }
        return null;
    }

    public static void main(String[] args) {
        MovieList List = new MovieList();
        List.addMovieItem("a");
        List.addMovieItem("b");
        List.addMovieItem("c");
        List.addMovieItem("d");
        List.addMovieItem("e");
        List.printMovieList();

        String search = List.findItem("a");
        System.out.println(search);

        List.modifyMovieItem(1, "A");
        List.printMovieList();
    }
}
