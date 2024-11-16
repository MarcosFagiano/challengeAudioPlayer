public class Main {
    public static void main(String[] args) {
        // Song song = new Song();
        // song.setArtist("la renga");
        // song.setAlbum("la renga");
        // song.setTitle("El final es donde parti");

        // for (int i = 0; i < 100; i++) {
        // song.like();
        // song.play();
        // }
        // System.out.println("""

        // Title: %s
        // Band: %s
        // Album: %s
        // Total reproduction: %d
        // Total Likes: %d
        // """.formatted(song.getArtist(), song.getAlbum(), song.getAlbum(),
        // song.getTotalPlay(), song.getTotalLikes()));
        // Favorite myFavorite = new Favorite();
        // myFavorite.addFavorite(song);
        // //myFavorite.addFavorite(podcast);



        //test dataset

        Audio[] audios = {
            new Audio("Song 1", 120, 500, 4),
            new Audio("Podcast 1", 200, 300, 5),
            new Audio("Song 2", 80, 400, 3),
            new Audio("Podcast 2", 150, 600, 4),
            new Audio("Song 3", 110, 450, 5),
            new Audio("Podcast 3", 90, 200, 4),
            new Audio("Song 4", 130, 700, 5),
            new Audio("Podcast 4", 220, 800, 4),
            new Audio("Song 5", 100, 350, 3),
            new Audio("Podcast 5", 175, 500, 5),
            new Audio("Song 6", 95, 400, 4),
            new Audio("Podcast 6", 210, 700, 5),
            new Audio("Song 7", 85, 600, 3),
            new Audio("Podcast 7", 250, 900, 4),
            new Audio("Song 8", 140, 550, 4),
            new Audio("Podcast 8", 160, 450, 3),
            new Audio("Song 9", 170, 800, 5),
            new Audio("Podcast 9", 200, 650, 4),
            new Audio("Song 10", 190, 950, 5),
            new Audio("Podcast 10", 300, 1200, 5),
            new Audio("Song 11", 100, 500, 3),
            new Audio("Podcast 11", 210, 700, 4),
            new Audio("Song 12", 125, 650, 4),
            new Audio("Podcast 12", 240, 800, 5),
            new Audio("Song 13", 105, 400, 3),
            new Audio("Podcast 13", 230, 900, 4),
            new Audio("Song 14", 155, 600, 5),
            new Audio("Podcast 14", 170, 750, 4),
            new Audio("Song 15", 135, 700, 3),
            new Audio("Podcast 15", 275, 1000, 5),
            new Audio("Song 16", 120, 450, 4),
            new Audio("Podcast 16", 210, 600, 4),
            new Audio("Song 17", 115, 500, 3),
            new Audio("Podcast 17", 190, 700, 4),
            new Audio("Song 18", 180, 900, 5),
            new Audio("Podcast 18", 300, 1200, 5),
            new Audio("Song 19", 110, 550, 4),
            new Audio("Podcast 19", 150, 650, 4),
            new Audio("Song 20", 160, 750, 5),
            new Audio("Podcast 20", 250, 850, 5),
            new Audio("Song 21", 130, 600, 4),
            new Audio("Podcast 21", 175, 900, 4),
            new Audio("Song 22", 140, 650, 3),
            new Audio("Podcast 22", 210, 1000, 5),
            new Audio("Song 23", 145, 700, 4),
            new Audio("Podcast 23", 300, 1200, 5),
            new Audio("Song 24", 100, 500, 3),
            new Audio("Podcast 24", 275, 900, 4),
            new Audio("Song 25", 185, 800, 5)
        };

        Audio showAudio = new Audio();

        
        //showAudio.showList(audios);
        showAudio.showTitle(audios);
    }
    
}
