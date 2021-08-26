package rainbow.model

import com.google.gson.annotations.SerializedName

data class Chat(
    @field:SerializedName("senderId")
    val senderId: SenderId,

    @field:SerializedName("time")
    val time: Time,

    @field:SerializedName("message")
    val message: String,

    @field:SerializedName("type")
    val type: Int
)