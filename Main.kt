fun main() {

    val herry : Human = Human("Galang Aji")
    val agung : Human = Human("agil")

    dhanu.email = "galang-ap@codecamp.com"
    dhanu.address = "Grabag, magelang"

    agung.email = "agil.mobellejen@gmail.com"
    agung.address = "Grabag, Magelang"

    herry.talk()
    agung.talk()

    herry.introduce()

    println(herry.verify("galang-ap@codecamp.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nationality)

    println(herry)
}