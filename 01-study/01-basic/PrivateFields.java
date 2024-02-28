public class PrivateFields {
    private String surName; // private var
    public String name; // public var

    // private method
    private void setSurName(String surName) {
        this.surName = surName;
    }

    // public method
    public void setName(String name, String surName) {
        this.name = name;
        this.setSurName(surName);
    }

    // public method
    void getName() {
        System.out.println(this.name + " " + this.surName);
    }

}
