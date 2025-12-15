public class StreamContent {
    String contentCode;
    String title;
    String genre;
    
    public StreamContent(String contentCode, String title, String genre) {
        this.contentCode = contentCode;
        this.title = title;
        this.genre = genre;
    }
    
    public void showInfo() {
        System.out.println("=== Información del Contenido ===");
        System.out.println("Código: " + contentCode);
        System.out.println("Título: " + title);
        System.out.println("Género: " + genre);
        System.out.println("-----------------------------------");
    }
}
