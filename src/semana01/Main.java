public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   STREAMFLIX - Catálogo de Contenidos");
        System.out.println("========================================\n");
        
        StreamContent contenido1 = new StreamContent("STR-001", "Stranger Things", "Ciencia Ficción");
        StreamContent contenido2 = new StreamContent("STR-002", "The Crown", "Drama Histórico");
        StreamContent contenido3 = new StreamContent("STR-003", "Breaking Bad", "Thriller");
        StreamContent contenido4 = new StreamContent("STR-004", "Nuestro Planeta", "Documental");
        StreamContent contenido5 = new StreamContent("STR-005", "La Casa de Papel", "Acción");
        
        contenido1.showInfo();
        contenido2.showInfo();
        contenido3.showInfo();
        contenido4.showInfo();
        contenido5.showInfo();
        
        System.out.println("\nTotal de contenidos en catálogo: 5");
        System.out.println("========================================");
    }
}
