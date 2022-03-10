fun main () {
    myProgram("codeHive")
    getRemainder(20,6)
    myBiodata("Nakimuli Mary Susan",22)
    getLength("AkiraChix")
}
fun myProgram (name:String){
    var program = (name)
    var newString = name[4].toString() +name[5] +name[6] +name[7]
    println(newString)

}
fun getRemainder (num1:Int,num2:Int):Int {
    var remainder = num1 % num2
    println(remainder)
    return remainder
}
fun myBiodata (p:String,z:Int){
    var mine = ("Hi, my name is $p and I am $z years old.")
    println(mine)

}
fun getLength (y:String) {
    println(y.length)
}