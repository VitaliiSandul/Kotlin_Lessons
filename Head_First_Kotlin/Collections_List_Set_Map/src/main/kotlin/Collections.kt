data class Recipe(var name: String)

fun main(){
    var mShoppingList = mutableListOf("Tea","Eggs","Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf("Cookies","Sugar","Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")
    if (mShoppingList.contains("Eggs")){
        mShoppingList.set(mShoppingList.indexOf("Tea"),"Coffee")
    }
    println("mShoppingList replaced item: $mShoppingList")

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

//    println("-----------------------------------")
//    var a: MutableList<String> = mutableListOf()
//    a.add(0, "Zero")
//    a.add(1, "Two")
//    a.add(2, "Four")
//    a.add(3, "Six")
//    println(a)
//    if (a.contains("Zero")) a.add("Eight")
//    a.removeAt(0)
//    println(a)
//    if (a.indexOf("Four") != 4) a.add("Ten")
//    println(a)
//    println(a)

    println("-----------------------------------")
    var mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    println("-----------------------------------")
    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")
    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }

}