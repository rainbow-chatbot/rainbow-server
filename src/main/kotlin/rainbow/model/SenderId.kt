package rainbow.model

import com.google.gson.annotations.SerializedName

data class SenderId(
    @field:SerializedName("high")
    val high: Int,

    @field:SerializedName("low")
    val low: Int,

    @field:SerializedName("unsigned")
    val unsigned: Boolean
)