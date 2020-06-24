fun Fridge.take(productName: String): Product {
    this.open()
    val prod = this.find(productName)
    this.close()
    return prod
}