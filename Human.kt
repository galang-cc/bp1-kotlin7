class Human(val name = "Galang") {

    //property/atribut/field
    var email = "galang-ap@codecamp.com"
    var address = "Grabag, Magelang"

    //method
    fun talk() {
        println("Alamat email saya adalah $email")
    }

    fun verify(email: String): Boolean {
        return email == this.email
    }

    fun introduce() {
        println("Perkenalkan nama saya adalah $name")
    }
}