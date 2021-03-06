package com.quangnguyen.hoga.ui.explore

import com.quangnguyen.hoga.domain.entity.Image
import com.quangnguyen.hoga.ui.base.BasePresenter


interface ExploreContract {

  interface View {

    fun showImages(images: List<Image>)

    fun clearImages()

    fun showErrorMessage(errorMsg: String)

    fun startLoadingIndicator()

    fun stopLoadingIndicator()

    fun showImageDetail(imageId: String)
  }

  interface Presenter : BasePresenter {

    fun loadTrendingImages()

    fun searchImages(keyword: String)

    fun loadImageDetail(imageId: String)
  }
}