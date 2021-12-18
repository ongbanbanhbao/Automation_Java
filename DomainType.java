package Lab6_Ver2;

public enum DomainType {
    COM(".com"),
    NET(".net"),
    VN(".vn");

    private String value;
    DomainType(String value){
        this.value = value;

    }
    public String getValue(){
        return this.value;
    }
}
