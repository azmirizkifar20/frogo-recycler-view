package com.frogobox.recycler.util

import com.frogobox.recycler.FrogoRecyclerView
import com.frogobox.recycler.boilerplate.adapter.callback.FrogoAdapterCallback
import com.frogobox.recycler.boilerplate.adapter.callback.FrogoMultiAdapterCallback

/*
 * Created by Faisal Amir
 * =========================================
 * FrogoRecyclerViewAdapter
 * Copyright (C) 27/04/2020.      
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * FrogoBox Inc
 * com.frogobox.recycler.util
 * 
 */
interface FrogoRvSingletonInterface<T> {

    fun createLayoutLinearVertical(dividerItem: Boolean): FrogoRvSingleton<T>

    fun createLayoutLinearHorizontal(dividerItem: Boolean): FrogoRvSingleton<T>

    fun createLayoutStaggeredGrid(spanCount: Int): FrogoRvSingleton<T>

    fun createLayoutGrid(spanCount: Int): FrogoRvSingleton<T>

    fun addEmptyView(layoutId: Int?): FrogoRvSingleton<T>

    fun addData(dataList: List<T>): FrogoRvSingleton<T>

    fun addCustomView(layoutId: Int): FrogoRvSingleton<T>

    fun addCallback(callback: FrogoAdapterCallback<T>): FrogoRvSingleton<T>

    fun createAdapter(): FrogoRvSingleton<T>

    fun addMultiCustomView(multiLayoutId: List<Int>): FrogoRvSingleton<T>

    fun addMultiOptionHolder(optionHolder: List<Int>): FrogoRvSingleton<T>

    fun addMultiCallback(callback: FrogoMultiAdapterCallback<T>): FrogoRvSingleton<T>

    fun createMultiAdapter(): FrogoRvSingleton<T>

    fun build(frogoRecyclerView: FrogoRecyclerView): FrogoRvSingleton<T>

}