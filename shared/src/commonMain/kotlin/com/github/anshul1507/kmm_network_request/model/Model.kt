package com.github.anshul1507.kmm_network_request.model

data class Model(
    val label: String,
    val list: List<SecondModel>
    )

data class SecondModel(
    val id: Int,
    val name: String
)
