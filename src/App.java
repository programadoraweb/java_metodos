public class App {
    public static void main(String[] args) throws Exception {
        String primeira = "Anna";
        String segunda = "Maria";
        String terceira = "Maria";


        System.out.println(primeira.toUpperCase());
        // metodo objeto.toUpperCase()
        System.out.println(segunda.length());
        // metodo objeto.length()
        System.out.println(terceira);


        //comparar a primeira com a segunda string 
        boolean result = primeira.equals(segunda);
        System.out.println("Primeira eh igual a segunda: " + result);

        //comparar a segunda com a terceira string 
        result = segunda.equals(terceira);
        System.out.println("Segunda eh igual a terceira: " + result);


    }
}
