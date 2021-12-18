package Lab6_Ver2;

public class Lab6_Ver2 {
    public static String buildingDomain (String domainName, SSL ssl, DomainType domainType){
        String completedDomainName;
        String domainPrefix = "http://";
        String domain;

        if (ssl.equals(SSL.TRUE))
        domainPrefix = "https://";

        if(domainType == null)
            throw new IllegalArgumentException("Domain type cannot be Null!");
        else
        domain = domainType.getValue();

        completedDomainName = domainPrefix + domainName + domain;
        return completedDomainName;
    }

    public static void main(String[] args) {
        String domainName = "Intel";
        String completedDomainName = Lab6_Ver2.buildingDomain(domainName, SSL.TRUE, DomainType.COM);
        System.out.println(completedDomainName);
    }
}
