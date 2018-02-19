package com.visal_suos.rxjava2_dagger2_mvp_room.mvp.view

import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.interactor.models.DataTestModel

/**
 * Created by v.suos on 2/8/2018.
 */
interface MainView {
    fun onDataTestLoaded(dataTest: List<DataTestModel>);
    fun onDataError(error: String)
}