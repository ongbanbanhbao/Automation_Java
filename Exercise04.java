package lesson4;

public class Exercise04 {
    public static void main(String[] args) {
        String link = "https://google.com";

        String localPart = link.substring(0, link.indexOf("://"));
        String domainPart = link.substring(link.indexOf("."), link.length());

        System.out.println("Local Part: " + localPart);
        System.out.println("Domain Part: " + domainPart);
    }
}
