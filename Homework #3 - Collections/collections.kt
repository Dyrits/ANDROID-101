/*
Android 101 - Kotlin Collections | Homework Assignment #3: Collections
 What is the difference between a list and an array? When would each be appropriate too use?
 A list is an immutable sequential fixed-size collection storing items. The items it contains and its sized can't be modified.
 (An immutable object is an object whose state cannot be modified after it is created.)
 An array is a mutable sequential fixed-size collection storing items. The items it contains can be modified but it sized can't.
 Therefor, a list is best to store immutable items, such as constants, although an array is best to store mutable items.
 For example, in the alphabet, vowels won't change, so it seems appropriate to use a list to store them.
 For a fixed-size collection, like a top 3, or top 10, for example, which can evolve but keep the same size, it seems appropriate to use an array.
*/

val vowels = listOf<Char>('A', 'E', 'I', 'O', 'U') // Vowels in the English language.
val movies = arrayOf<String>("Cloud Atlas", "Ink", "The Frame") // My three favorite movies (so far).