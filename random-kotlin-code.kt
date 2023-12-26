fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4, 5)

  // Виведіть список на екран
  println(list)

  // Знайдіть максимальне значення в списку
  val max = list.max()

  // Виведіть максимальне значення на екран
  println(max)

  // Створіть новий список, що складається з квадратів елементів першого списку
  val newList = list.map { it * it }

  // Виведіть новий список на екран
  println(newList)

  // Створіть новий список, що складається з елементів першого списку, які більше 3
  val filteredList = list.filter { it > 3 }

  // Виведіть новий список на екран
  println(filteredList)
}
