package rainbow.model

import com.google.gson.annotations.SerializedName

data class Time(
    @field:SerializedName("week")
    val week: String,

    @field:SerializedName("month")
    val month: Int,

    @field:SerializedName("hour")
    val hour: Int,

    @field:SerializedName("year")
    val year: Int,

    @field:SerializedName("day")
    val day: Int,

    @field:SerializedName("minute")
    val minute: Int,

    @field:SerializedName("second")
    val second: Int
)