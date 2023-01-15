package com.example.rajue_mobileprjct.model

import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("judul_produkserum")
    val title: String?,
    @SerializedName("gambar_serum")
    val thumbnail: String?,
    @SerializedName("isi_itemserum")
    val detail: String?,
    @SerializedName("judul_produktoner")
    val titletoner: String?,
    @SerializedName("gambar_produktoner")
    val thumbnailtoner: String?,
    @SerializedName("isi_itemtoner")
    val detailtoner: String?,

    ////////////////---------------
    @SerializedName("no_izin_edar")
    val no_izin: String?,
    @SerializedName("diproduksi_oleh")
    val produksi: String?,

)