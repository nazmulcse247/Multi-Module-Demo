package com.nazmul.multimoduledemo.screen.home

import com.nazmul.domain.model.Blog

data class HomeState(
    var isLoading:Boolean=false,
    var data:List<Blog>?=null,
    var error:String=""
)