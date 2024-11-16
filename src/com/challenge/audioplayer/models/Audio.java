import java.util.Scanner;

public class Audio implements Interface {
    private String title;
    private int totalPlay;
    private int totalLikes;
    private int calification;

    // metods

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalPlay++;
    }

    public int getCalification() {
        return calification;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getTotalPlay() {
        return totalPlay;
    }

    // setters
    public void setCalification(int calification) {
        this.calification = calification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public void setTotalPlay(int totalPlay) {
        this.totalPlay = totalPlay;
    }

    // interface
    @Override
    public void showTitle(Audio[] audios) {
        try {
            int count = 1;
            System.out.println("Titulos:");
            for (Audio audio : audios) {
                count++;
                System.out.println("""
                        [%d] %s
                        """.formatted(count, audio.title));
            }
        } catch (Exception e) {
            throw new UnsupportedOperationException("No se pudo cargar la lista, o la lista esta vacia.");

        }
    }

    @Override
    public void showList(Audio[] audios) {
        try {
            for (Audio audio : audios) {
                System.out.println("""
                        Titulo: %s | Reproducciones: %d | Likes: %d | Calificacion: %d
                        """.formatted(audio.title, audio.totalPlay, audio.totalLikes, audio.calification));

            }
        } catch (Exception e) {
            throw new UnsupportedOperationException("No se pudo cargar la lista, o la lista esta vacia.");

        }
    }

    @Override
    public void insertAudio(Audio audio) {
        try {
            Audio input = new Audio();
            input.calification = audio.calification;
            input.title = audio.title;
            input.totalLikes = audio.totalLikes;
            input.totalPlay = audio.totalPlay;
        } catch (Exception e) {
            throw new UnsupportedOperationException("No se pudo cargar el nuevo audio. \nError:" + e);
        }
    }

    @Override
    public void showMenu() {
        Scanner kScanner = new Scanner(System.in);
        int option;
        do {

            System.out.println("""
                    Ingrese la opcion deseada:
                    [1] Mostrar lista.
                    [2] Mostrar titulo.
                    [3] Ingresar audio.
                    [0] Salir.
                    opcion:
                    """);
            option = kScanner.nextInt();
            kScanner.nextLine();

            switch (option) {
                case 1:
                    showList(null);
                    break;
                case 2:
                    showTitle(null);
                    break;
                case 3:
                    insertAudio(null);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Valor fuera de rango, intente nuevamente.");
                    break;
            }
        } while (option != 0);
        kScanner.close();
    }

    public Audio(String title, int totalLikes, int totalPlay, int calification) {
        this.title = title;
        this.totalLikes = totalLikes;
        this.totalPlay = totalPlay;
        this.calification = calification;
    }

    // test dataset

    public Audio() {
        // TODO Auto-generated constructor stub
    }

}
