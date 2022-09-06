object t6q1 extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val shift = (scala.io.StdIn.readLine("Shift number: ").toInt + alphabet.size) % alphabet.size

  val inputText = scala.io.StdIn.readLine("Enter the code which you want to encrypt or decrypt: ")


  val Encryption = (shift: Int) => inputText.map((c: Char) => {

    val x = alphabet.indexOf(c.toUpper)

    if (x == -1) c

    else alphabet((x + shift + alphabet.size) % alphabet.size)
  });


  val Dycryption = (shift: Int) => inputText.map((c: Char) => {

    val x = alphabet.indexOf(c.toUpper)

    if (x == -1) c

    else alphabet((x - shift + alphabet.size) % alphabet.size)
  });


  println("Enter 1-to encrypt the code");
  println("Enter 2-to decrypt the code");
  val n = scala.io.StdIn.readInt()

  if (n == 1) println("Encrypted message: " + Encryption(shift))

  else println("Decrypted message: " + Dycryption(shift))
}