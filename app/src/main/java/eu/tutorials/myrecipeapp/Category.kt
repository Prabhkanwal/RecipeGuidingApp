package eu.tutorials.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(val idCategory : String,
val strCategory : String, // name
 val strCategoryThumb : String, // image
 val strCategoryDescription : String):Parcelable
// Parcelable implementation allows this data class to be passed between Activities or Fragments efficiently and between different Screens .
// Serializing meaning converting the object into string and deserializing means converting that string into the object.
data class CategoriesResponse(val categories : List<Category>)